package com.yh.fengzhuangadapter;

/**
 * Created by yh on 2017-08-09.
 */

import android.content.Context;
import android.widget.TextView;



import java.util.List;

/**
 * Created by smyhvae on 2015/5/4.
 */
public class ListViewAdapterWithViewHolder extends ListViewAdapter<Bean> {

    //MyAdapter需要一个Context，通过Context获得Layout.inflater，然后通过inflater加载item的布局
    public ListViewAdapterWithViewHolder(Context context, List<Bean> datas) {
        super(context, datas, R.layout.list_item);
    }

    @Override
    public void convert(ViewHolder holder, Bean bean) {

        ((TextView) holder.getView(R.id.titleTv)).setText(bean.getTitle());
        ((TextView) holder.getView(R.id.descTv)).setText(bean.getDesc());
        ((TextView) holder.getView(R.id.timeTv)).setText(bean.getTime());
        ((TextView) holder.getView(R.id.phoneTv)).setText(bean.getPhone());

/*
        TextView tv = holder.getView(R.id.titleTv);
        tv.setText(...);

       ImageView view = getView(viewId);
       Imageloader.getInstance().loadImag(view.url);
*/
    }
}
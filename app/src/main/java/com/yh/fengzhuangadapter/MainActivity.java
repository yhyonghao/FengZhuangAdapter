package com.yh.fengzhuangadapter;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private ListView listView;
    private List<Bean> mDatas;

    private ListViewAdapterWithViewHolder listViewAdapterWithViewHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
    }


    //方法：初始化View
    private void initView() {
        listView = (ListView) findViewById(R.id.listView);
    }

    //方法；初始化Data
    private void initData() {
        mDatas = new ArrayList<Bean>();

        //将数据装到集合中去
        Bean bean = new Bean("Android新技能1", "Android为ListView和GridView打造万能适配器", "2015-05-04", "10086");
        mDatas.add(bean);

        bean = new Bean("Android新技能2", "Android为ListView和GridView打造万能适配器", "2015-05-04", "10086");
        mDatas.add(bean);

        bean = new Bean("Android新技能3", "Android为ListView和GridView打造万能适配器", "2015-05-04", "10086");
        mDatas.add(bean);

        bean = new Bean("Android新技能4", "Android为ListView和GridView打造万能适配器", "2015-05-04", "10086");
        mDatas.add(bean);

        //为数据绑定适配器
        listViewAdapterWithViewHolder = new ListViewAdapterWithViewHolder(this, mDatas);

        listView.setAdapter(listViewAdapterWithViewHolder);

    }
}
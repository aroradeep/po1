package com.deeparora.po;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CluList extends AppCompatActivity {
    ListView listView;
    ArrayList<UserActivity> userList;
    CustomAdapter adapter;
    void initlist(){
        listView= (ListView) findViewById(R.id.list);
        UserActivity u1=new UserActivity("111","clu1","ldh","#we2");
        UserActivity u2=new UserActivity("112","clu2","jaln","$32e");
        UserActivity u3=new UserActivity("113","clu3","pun","32W");
        UserActivity u4=new UserActivity("114","clu4","Moga","&gh");
        UserActivity u5=new UserActivity("115","clu5","bathinda","!~@");

        userList = new ArrayList<>();
        userList.add(u1);
        userList.add(u2);
        userList.add(u3);
        userList.add(u4);
        userList.add(u5);

        adapter = new CustomAdapter(this,R.layout.listitem,userList);
        listView.setAdapter(adapter);



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clu_list);
        initlist();
    }
}

package com.deeparora.po;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Waheguru on 7/24/2018.
 */

public class CustomAdapter extends ArrayAdapter<UserActivity> {
    Context context;
    int resource;
    ArrayList<UserActivity> userList;

    public CustomAdapter(Context context, int resource, ArrayList<UserActivity> objects) {
        super(context, resource, objects);

        this.context = context;
        this.resource = resource;
        userList = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null;

        // view is a reference variable which shall point to list_item
        view = LayoutInflater.from(context).inflate(resource,parent,false);


        TextView txtName = view.findViewById(R.id.clu_id);
        TextView txtPhone = view.findViewById(R.id.clu_name);

        TextView district = view.findViewById(R.id.clu_district);
        TextView licence = view.findViewById(R.id.clu_licence);


        UserActivity user = userList.get(position);

        txtName.setText(user.getClu_id());
        txtPhone.setText(user.getClu_name());
        district.setText(user.getClu_district());
        licence.setText(user.getClu_licence());

        return view;
    }
}
package com.example.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class userAdapter extends ArrayAdapter<User> {
    public userAdapter( Context context,   ArrayList<User> users) {
        super(context, 0, users);
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View currentListView=convertView;
        if (currentListView==null){
            currentListView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
         User currentUser=getItem(position);
       TextView tv_username=currentListView.findViewById(R.id.tv_item_username);
       tv_username.setText(currentUser.getUserName());
        TextView tv_password= currentListView.findViewById(R.id.tv_item_message);
        tv_password.setText(currentUser.getUserMessage());
        ImageView iv_userImage =currentListView.findViewById(R.id.lv_user);
        iv_userImage.setImageResource(currentUser.getUserImg());
        return currentListView;
    }
}

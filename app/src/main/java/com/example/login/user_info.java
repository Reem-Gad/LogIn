package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class user_info extends AppCompatActivity {
ListView listView;
EditText edt_message;
Button btn_add;
 static String UserName;
 ArrayList<User>users=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        if (getIntent()!=null){
            UserName=getIntent().getStringExtra("user name");

        }
        listView=findViewById(R.id.lv_showUser);
        final userAdapter userAdapter=new userAdapter(getApplicationContext(),users);
        listView.setAdapter(userAdapter);
        edt_message=findViewById(R.id.edt_message);
        btn_add=findViewById(R.id.btn_add);
btn_add.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        users.add(new User(UserName,edt_message.getText().toString(),R.drawable.r));
        userAdapter.notifyDataSetChanged();
        edt_message.setText("");
    }
});
listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(getApplicationContext(),users.get(i).toString(),Toast.LENGTH_LONG).show();
    }
});

    }
}
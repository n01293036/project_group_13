package com.example.project_group_13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuRight extends AppCompatActivity {

    TextView seeDetailcu;
    TextView seeDetail123;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_right);

        seeDetail123= (TextView) findViewById(R.id.myprofile);
        seeDetail123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuRight.this,MyProfileMinh.class);
                startActivity(intent);
            }
        });

        seeDetailcu= (TextView) findViewById(R.id.textView21);
        seeDetailcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuRight.this,CommunicationEmailMinh.class);
                startActivity(intent);
            }
        });


    }
}
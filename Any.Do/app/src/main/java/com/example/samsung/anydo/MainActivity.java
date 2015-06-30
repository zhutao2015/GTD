package com.example.samsung.anydo;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
    FragmentManager fragmentManager=null;
    FragmentTransaction fragmentTransaction=null;
    private Button sttingButton;
    private Button notificationButton;
    private Button taskManagerButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sttingButton= (Button) findViewById(R.id.setting_button);
        sttingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, SettingActivity.class);
                startActivity(in);
            }
        });
        notificationButton= (Button) findViewById(R.id.notification_button);
        notificationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, NotificationActivity.class);
                startActivity(in);
            }
        });
        taskManagerButton= (Button) findViewById(R.id.task_manager_button);
        taskManagerButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, TaskManagerActivity.class);
                startActivity(in);
            }
        });


    }

}

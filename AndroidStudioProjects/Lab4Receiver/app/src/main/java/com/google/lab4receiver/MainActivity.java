package com.google.lab4receiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tv;
BroadcastReceiver standAloneRx;
BroadcastReceiver subClassedRx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView);

        IntentFilter filter = new IntentFilter();

        filter.addAction("com.google.lab4broadcaster");
        standAloneRx = new MyStandAloneReceiver();
        registerReceiver(standAloneRx, filter);
        subClassedRx = new MySubclassReceiver();
        registerReceiver(subClassedRx, filter);
    }
    @Override
    protected void onDestroy(){
        unregisterReceiver(standAloneRx);
        super.onDestroy();
    }

}

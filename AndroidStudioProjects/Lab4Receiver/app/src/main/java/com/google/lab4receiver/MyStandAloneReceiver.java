package com.google.lab4receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyStandAloneReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        String msg = "Received message:" + intent.getStringExtra("Life_form");
        tv.setText(msg);
    }

    @Override
    protected void onDestroy(){
        unregisterReceiver
    }
}

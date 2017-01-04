package com.example.administrator.alwaysontoptest;

import android.app.Activity;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void mStart(View v) {
        startService(new Intent(this, AlwaysTopService2.class));
    }

    public void mStop(View v) {
        stopService(new Intent(this, AlwaysTopService2.class));
    }

}

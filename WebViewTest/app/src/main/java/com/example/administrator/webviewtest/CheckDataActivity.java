package com.example.administrator.webviewtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CheckDataActivity extends AppCompatActivity {

    TextView mydata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_data);
        mydata = (TextView)findViewById(R.id.myData);
        Intent intent = getIntent();
        mydata.setText(intent.getExtras().getString("data"));
    }
}

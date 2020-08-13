package com.example.fisrtactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    String takeExtra1;
    String takeExtra2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent myIntent1 = new Intent();
        Intent myIntent2 = new Intent();
        takeExtra1= myIntent1.getStringExtra("Extra1");
        takeExtra2= myIntent2.getStringExtra("Extra2");

    }
}
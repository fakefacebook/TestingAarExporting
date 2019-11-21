package com.android.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.android.mylibrary.MyLibrary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyLibrary.hi();
    }
}

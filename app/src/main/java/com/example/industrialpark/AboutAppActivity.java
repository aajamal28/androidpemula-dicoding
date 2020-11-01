package com.example.industrialpark;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AboutAppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar menu = getSupportActionBar();
        //menu.setDisplayShowHomeEnabled(true);
        menu.setDefaultDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.activity_about_app);


    }
}

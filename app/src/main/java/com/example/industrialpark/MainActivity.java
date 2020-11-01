package com.example.industrialpark;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvindPark;
    private ArrayList<indPark> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvindPark = findViewById(R.id.rcv_indpark);
        rvindPark.setHasFixedSize(true);

        list.addAll(indParkData.geListData());
        showRecyclerList();

    }


    private void showRecyclerList() {
        rvindPark.setLayoutManager(new LinearLayoutManager(this));
        ListParkAdapter listParkAdapter = new ListParkAdapter(list);
        rvindPark.setAdapter(listParkAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //setMode(item.getItemId());
        //return super.onOptionsItemSelected(item);
        if (item.getItemId() == R.id.aboutapp) {
            Intent aboutApp = new Intent(MainActivity.this, AboutAppActivity.class);
            startActivity(aboutApp);
        }else {
            Intent aboutMe = new Intent(MainActivity.this, AboutMeActivity.class);
            startActivity(aboutMe);
        }
        return true;
    }
}

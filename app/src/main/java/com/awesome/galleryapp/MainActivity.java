package com.awesome.galleryapp;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<GalleryStore> mGallery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //custom data
        initAppData();

        //initialize ui
        initUi();
    }
    private void initUi(){
        Toolbar actionBar = (Toolbar) findViewById(R.id.actionBar);
        setSupportActionBar(actionBar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        // Change status bar color
        if(Build.VERSION.SDK_INT >=21)
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimaryDark));
        RecyclerView profileAdapter = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(MainActivity.this, mGallery);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        profileAdapter.setLayoutManager(linearLayoutManager);
        profileAdapter.setNestedScrollingEnabled(false);
        profileAdapter.setAdapter(recyclerViewAdapter);
    }

    private void initAppData(){
        mGallery = new ArrayList<GalleryStore>();
        ArrayList<Integer> mImages = new ArrayList<>(3);
        mImages.add(new Integer(R.drawable.download));
        mImages.add(new Integer(R.drawable.profile));
        mImages.add(new Integer(R.drawable.jdpp));
        mGallery.add(new GalleryStore("Landscape",2354,mImages));
        mGallery.add(new GalleryStore("People",2354,mImages));
        mGallery.add(new GalleryStore("Landscape",2344,mImages));
        mGallery.add(new GalleryStore("People",2354,mImages));
        mGallery.add(new GalleryStore("Landscape",2354,mImages));
        mGallery.add(new GalleryStore("Landscape",2354,mImages));
        mGallery.add(new GalleryStore("Landscape",2354,mImages));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
  }

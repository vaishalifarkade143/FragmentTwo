package com.example.fragmenttwo.fragmentdemotwo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.fragmenttwo.R;

public class MainActivityOne extends AppCompatActivity {

    //ViewPager myviewpager;


    ViewPager2 myviewpager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_one);

        //using ViewPager2

        myviewpager2=findViewById(R.id.myviewpager2);
        MyAdapter myadapter = new MyAdapter(getSupportFragmentManager(),getLifecycle());
        myviewpager2.setAdapter(myadapter);


        // using ViewPager

//        myviewpager = findViewById(R.id.myviewpager);
//        MyAdapter myAdapter = new MyAdapter(getSupportFragmentManager());
//        myviewpager.setAdapter(myAdapter);


    }
}
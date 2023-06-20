package com.example.fragmenttwo.demothree;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.fragmenttwo.R;
import com.google.android.material.tabs.TabLayout;

public class MainActivityThree extends AppCompatActivity
{
    TabLayout wa_tabLayout;
    ViewPager2 wa_viewp2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_three);

        wa_tabLayout = (TabLayout) findViewById(R.id.wa_tabLayout);
        wa_viewp2 = (ViewPager2) findViewById(R.id.wa_viewp2);

        WhatsAppAdapter waAdapter = new WhatsAppAdapter(getSupportFragmentManager(),getLifecycle());
        wa_viewp2.setAdapter(waAdapter);

        //to move the indicator
       /* wa_tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                wa_viewp2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });*/

        wa_viewp2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                wa_tabLayout.selectTab(wa_tabLayout.getTabAt(position));
            }
        });
    }

}
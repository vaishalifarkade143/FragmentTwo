package com.example.fragmenttwo.demotwo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.fragmenttwo.R;
import com.google.android.material.tabs.TabLayout;

public class MainActivityTwo extends AppCompatActivity {
    TabLayout tab_two;
    FrameLayout frm_two;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);
        tab_two = (TabLayout)findViewById(R.id.tab_two);

        // manuallya tab  add karan TabLaout par
        TabLayout.Tab first= tab_two.newTab();
        first.setText("chat");
        first.setIcon(R.drawable.chat);
        tab_two.addTab(first);

        TabLayout.Tab second= tab_two.newTab();
        second.setText("status");
        second.setIcon(R.drawable.status);
        tab_two.addTab(second);

        TabLayout.Tab third= tab_two.newTab();
        third.setText("call");
        third.setIcon(R.drawable.call);
        tab_two.addTab(third);

        //by default fragment one open
        frgmoneee onee = new frgmoneee();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frm_two,onee);
        fragmentTransaction.commit();//

        tab_two.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab)
            {
                //Fragment ye parent class hai to parent class me child class ka Object store kar sakte hai (e.g frgmoneee)
                Fragment fragment = null;
                switch (tab.getPosition())
                {

                    case 0:
                        fragment = new frgmoneee();
                        break;
                    case 1:
                       fragment = new frgmtwooo();
                       break;
                    case 2:
                        fragment = new frgmthreee();
                        break;
                }
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frm_two,fragment);
                ft.commit();

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
     }
}
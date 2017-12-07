package com.example.gpramasita.papbproject;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.support.v7.widget.Toolbar;
//import android.view.Menu;
//import android.widget.TextView;

/**
 * Created by gpramasita on 12/7/17.
 */

public class SignupActivity extends AppCompatActivity {
    //TextView Parview;
    ViewPager tViewPager;
    TabLayout tTablayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        //Membuat halaman tab
        tTablayout = (TabLayout) findViewById(R.id.tabs);
        tTablayout.addTab(tTablayout.newTab().setText("Account Details"));
        tTablayout.addTab(tTablayout.newTab().setText("Personal Details"));
        tTablayout.addTab(tTablayout.newTab().setText("Social Account Details"));
        tTablayout.addTab(tTablayout.newTab().setText("Apply Global Leader"));
        tTablayout.setTabGravity(TabLayout.GRAVITY_FILL);

        //Menampilkan isi dari tab
        tViewPager = (ViewPager) findViewById(R.id.container);
        PageActivity page = new PageActivity(getSupportFragmentManager(), tTablayout.getTabCount());
        tViewPager.setAdapter(page);
        tViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                tTablayout.setScrollPosition(position, 0, true);
                tTablayout.setSelected(true);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        tTablayout.setupWithViewPager(tViewPager);
        tTablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                tViewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        //Menampilkan text pada form
        //Parview = (TextView) findViewById(R.id.Welcometxt);
        //Parview.setText("Congratulation ...!\n...\nHere is the registration form of our ... program");
    }


}

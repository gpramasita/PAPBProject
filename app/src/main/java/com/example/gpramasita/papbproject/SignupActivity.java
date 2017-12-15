package com.example.gpramasita.papbproject;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;



/**
 * Created by gpramasita on 12/7/17.
 */

public class SignupActivity extends AppCompatActivity {
    TextView Parview;
    ViewPager tViewPager;
    TabLayout tTablayout;
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        //Membuat halaman tab
        tTablayout = (TabLayout) findViewById(R.id.tabs);
        tTablayout.setupWithViewPager(tViewPager);
        tTablayout.addTab(tTablayout.newTab().setIcon(R.drawable.acc_logo));
        tTablayout.addTab(tTablayout.newTab().setIcon(R.drawable.det_logo));
        tTablayout.addTab(tTablayout.newTab().setIcon(R.drawable.soc_logo));
        tTablayout.addTab(tTablayout.newTab().setIcon(R.drawable.lead_logo));
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
        Parview = (TextView) findViewById(R.id.Welcometxt);
        Parview.setText("Congratulation for you!\nLet's take action and leadership opportunities with AIESEC Universitas Brawijaya\nHere is the registration form of our Global Leader program");
    }

    public void onSubmitClick (View v) {
        if (v.getId() == R.id.btnlead) {
            Intent intent = new Intent(SignupActivity.this, NotificationActvity.class);
            startActivity(intent);

        }
    }



}

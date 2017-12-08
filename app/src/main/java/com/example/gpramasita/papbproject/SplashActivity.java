package com.example.gpramasita.papbproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;

/**
 * Created by gpramasita on 12/7/17.
 */

public class SplashActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Thread untuk menampilkan splash screen dalam batasan waktu tertentu
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent SplashIntent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(SplashIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}

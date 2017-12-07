package com.example.gpramasita.papbproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by gpramasita on 12/7/17.
 */

public class SignupActivity extends AppCompatActivity {
    TextView Parview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Parview = (TextView) findViewById(R.id.Welcometxt);
        Parview.setText("Congratulation ...!\n...\nHere is the registration form of our ... program");
    }
}

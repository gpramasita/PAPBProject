package com.example.gpramasita.papbproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by gpramasita on 12/15/17.
 */

public class DisplayActivity extends AppCompatActivity {

    TextView resUsrname, resCountry, resSeason;
    ImageView resImage;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_display);

        Bundle resAll1 = getIntent().getExtras();
        resImage = (ImageView) findViewById(R.id.imageProfileVal);
        resUsrname = (TextView) findViewById(R.id.editNameVal);
        resCountry = (TextView) findViewById(R.id.spinnerCountryVal);
        resSeason = (TextView) findViewById(R.id.spinnerSeasonVal);

        Uri file_path = Uri.parse(getIntent().getStringExtra("Profile"));
        resImage.setImageURI(file_path);
        resUsrname.setText(resAll1.getCharSequence("Full Name"));
        resCountry.setText(resAll1.getCharSequence("Country"));
        resSeason.setText(resAll1.getCharSequence("Season"));

    }
    public void onBackClick(View v) {
        if (v.getId() == R.id.buttonHome) {
            Intent i = new Intent(DisplayActivity.this, HomeActivity.class);
            startActivity(i);
        }
}
}

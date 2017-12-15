package com.example.gpramasita.papbproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

/**
 * Created by gpramasita on 12/14/17.
 */

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void onStatusClick(View v) {
        if (v.getId() == R.id.bStatus) {
            Intent i = new Intent(HomeActivity.this, StatusActivity.class);
            startActivity(i);
        }
    }


    public void onApplyClick(View v) {
        if (v.getId() == R.id.bApply) {
            Intent i = new Intent(HomeActivity.this, ApplyActivity.class);
            startActivity(i);
        }
    }

    public void onViewClick(View v) {
        if (v.getId() == R.id.bGallery) {
            Intent i = new Intent(HomeActivity.this, PhotoActivity.class);
            startActivity(i);
        }
    }
    public void onProjectClick(View v) {
        if (v.getId() == R.id.bProject) {
            Intent i = new Intent(HomeActivity.this, ProjectActivity.class);
            startActivity(i);
        }
    }
}

package com.example.gpramasita.papbproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Created by gpramasita on 12/14/17.
 */


public class ProjectActivity extends AppCompatActivity {
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);
        hasil = (TextView) findViewById(R.id.tHasil);


    }

    public void onSubmitClick(View v) {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId()) {
                case R.id.rApply1:
                    if (checked) {
                        hasil.setText("Tunggu Hasil Konfirmasi dari Entrevolution Project!");
                    }
                    break;
                case R.id.rApply2:
                    if (checked) {
                        hasil.setText("Tunggu Hasil Konfirmasi dari Global Guardian Project!");
                    }
                    break;
                case R.id.rApply3:
                    if (checked) {
                        hasil.setText("Tunggu Hasil Konfirmasi dari Women in Business Project!");
                    }
                    break;
            }
    }

}

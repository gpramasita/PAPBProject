package com.example.gpramasita.papbproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by gpramasita on 12/14/17.
 */

public class StatusActivity extends AppCompatActivity {

    EditText name, position, department;
    TextView stat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_status);
        stat = (TextView) findViewById(R.id.statDisp);
        name = (EditText) findViewById(R.id.ETname);
        position = (EditText) findViewById(R.id.ETposition);
        department = (EditText) findViewById(R.id.ETdepartment);
    }

    public void onEditClick(View v) {
        if (v.getId() == R.id.bEdit) {
            stat.setText("Name "+name.getText().toString()+" \nCurrent Position "+position.getText().toString()+" \nDepartment "+department.getText().toString());

        }
    }
}

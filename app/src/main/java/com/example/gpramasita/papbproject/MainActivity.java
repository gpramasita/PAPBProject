package com.example.gpramasita.papbproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    TextView regUser;
    EditText mail, pswd;
    Button signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signin = (Button) findViewById(R.id.signinBtn);
        mail = (EditText) findViewById(R.id.edit_mail);
        pswd = (EditText) findViewById(R.id.edit_pswd);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mail.getText().toString().equals("aisecer") && pswd.getText().toString().equals("aiesec")){
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
                }
            }
        });

        regUser = (TextView) findViewById(R.id.signup);
        regUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });
    }
}

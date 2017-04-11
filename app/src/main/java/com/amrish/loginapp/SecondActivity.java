package com.amrish.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView log_username, log_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        log_username = (TextView)findViewById(R.id.textView3);
        log_password = (TextView)findViewById(R.id.textView4);

        Bundle bundle = getIntent().getExtras();
        final String username = bundle.getString("username");
        final String pass = bundle.getString("password");

        log_username.setText(username);
        log_password.setText(pass);
    }
}

package com.amrish.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email, password;
    Button signBtn;
    String emailText, passText;
    String validEmail = "admin@vuesol.com";
    String validPass = "password123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText)findViewById(R.id.editText);
        password = (EditText)findViewById(R.id.editText2);
        signBtn = (Button)findViewById(R.id.button);

        signBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emailText = email.getText().toString();
                passText = password.getText().toString();

                if (emailText.equals(validEmail)){
                    if (passText.equals(validPass)){
                        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                        intent.putExtra("username", emailText);
                        intent.putExtra("password", passText);
                        email.setText("");
                        password.setText("");
                        startActivity(intent);
                    } else {
                        Toast.makeText(getApplicationContext(), "wrong password", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "wrong email", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}

package com.example.myappswithdb;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in_dashboard);

        //get parameters inside intent
        Intent intent = getIntent();
        String emailG = intent.getStringExtra("emailG");
        String emailGo = intent.getStringExtra("email");

        //edit the text inside the view
        TextView txtSuccess = findViewById(R.id.welcomeMessage);

        if (emailG != null) {
            // Sign in with email
            txtSuccess.setText("Welcome " + emailG);
        } else if (emailGo != null) {
            // Sign in with Google
            txtSuccess.setText("Welcome " + emailGo);
        }
    }
}

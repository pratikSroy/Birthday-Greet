package com.example.birthdaygreet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class BirthdayGreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_greeting);

        final TextView birthdayMessage = findViewById(R.id.birthdayMessage);

        String message =  getIntent().getStringExtra("username");

        birthdayMessage.setText("Happy Birthday\n" +message);

    }
}
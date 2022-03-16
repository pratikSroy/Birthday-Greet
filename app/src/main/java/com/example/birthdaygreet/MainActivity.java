package com.example.birthdaygreet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText name_input = findViewById(R.id.nameInput);
        Button createMessage = findViewById(R.id.createBirthdayButton);

        createMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = name_input.getText().toString();

                Intent intent = new Intent(MainActivity.this, BirthdayGreetingActivity.class);
                intent.putExtra("username", name);
                startActivity(intent);

            }
        });
    }



}
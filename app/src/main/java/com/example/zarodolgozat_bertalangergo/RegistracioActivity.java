package com.example.zarodolgozat_bertalangergo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegistracioActivity extends AppCompatActivity {

     EditText editTextUserName, editTextPassword, editTextEmail;
     Button buttonSend;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registracio);

        init();
    }

    private void init() {

        editTextUserName = findViewById(R.id.editRegisztracioUserName);
        editTextEmail = findViewById(R.id.editRegisztracioEmail);
        editTextPassword = findViewById(R.id.editRegisztracioPassword);
        buttonSend = findViewById(R.id.buttonAdatbevitel);

    }
}
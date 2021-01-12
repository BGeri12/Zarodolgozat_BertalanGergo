package com.example.zarodolgozat_bertalangergo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BejelentkezesActivity extends AppCompatActivity {

     EditText editUserName, editPassword;
     Button buttonRegisztracio, buttonBejelentkezes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bejelentkezes);

        init();
        buttonRegisztracio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BejelentkezesActivity.this, RegistracioActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void init() {

        editUserName = findViewById(R.id.editBejelentUserName);
        editPassword = findViewById(R.id.editBejelentPassword);
        buttonBejelentkezes = findViewById(R.id.buttonBejelent);
        buttonRegisztracio = findViewById(R.id.buttonRegisztracio);
    }

}
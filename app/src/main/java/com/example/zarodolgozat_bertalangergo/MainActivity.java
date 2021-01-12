package com.example.zarodolgozat_bertalangergo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button jatek,beallitas,bejelentkezes;
    ImageView logo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        bejelentkezes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BejelentkezesActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    private void init() {

        jatek = findViewById(R.id.btn_main_play);
        beallitas = findViewById(R.id.btn_main_settings);
        bejelentkezes = findViewById(R.id.btn_main_bejelentkezes);
        logo = findViewById(R.id.tw_main_logo);

    }
}
package com.example.tanda2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnEjer1,btnEjer2,btnEjer3,btnEjer4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEjer1 = (Button) findViewById(R.id.button1);
        btnEjer2 = (Button) findViewById(R.id.button2);
        btnEjer3 = (Button) findViewById(R.id.button3);
        btnEjer4 = (Button) findViewById(R.id.button4);
        eventos();
    }

    public void eventos(){
        btnEjer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, actividad01.class);
                startActivity(intent);
            }
        });
        btnEjer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, actividad02.class);
                startActivity(intent);
            }
        });
        btnEjer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, actividad03.class);
                startActivity(intent);
            }
        });
        btnEjer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, actividad04.class);
                startActivity(intent);
            }
        });
    }
}
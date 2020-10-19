package com.example.tanda2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
    }
}
package com.example.tanda2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class actividad031 extends AppCompatActivity {

    private TextView cosas ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad031);
        Bundle extras = getIntent().getExtras();
        String s = extras.getString("usuario");
        ArrayList<String> i = extras.getStringArrayList("lista");
        cosas = (TextView) findViewById(R.id.textView8);
        String stringLargo = "";
        for(String a :i) {
            stringLargo+=a+" ";
        }
        cosas.setText(stringLargo);
    }
}
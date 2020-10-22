package com.example.tanda2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class actividad041 extends AppCompatActivity {

    TextView mayor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad041);
        Bundle father =  getIntent().getExtras();

        mayor = (TextView) findViewById(R.id.MayorDeEdad);
        if(father.getBoolean("Edad")){
            mayor.setText("Es mayor de edad.");
        }else{
            mayor.setText("No es mayor de edad.");
        }
    }
}
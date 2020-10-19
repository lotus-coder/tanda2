package com.example.tanda2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.security.spec.ECField;

public class actividad01 extends AppCompatActivity {

    private Button btnVolver,btnVerificar;
    private EditText txtNombre,txtApellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad01);
        btnVerificar = (Button) findViewById(R.id.verificar);
        btnVolver = (Button) findViewById(R.id.volver);
        txtApellido = (EditText) findViewById(R.id.textNombre);
        txtNombre = (EditText) findViewById(R.id.textApellido);
        eventos();
    }


    private void eventos(){
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(actividad01.this, actividad012.class);
                intent.putExtra("Nombre", txtNombre.getText().toString());
                intent.putExtra("Apellido",txtApellido.getText().toString());
                startActivity(intent);
            }
        });
    }
}
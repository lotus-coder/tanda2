package com.example.tanda2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class actividad012 extends AppCompatActivity {
    private Button btnAceptar, btnRechazar;
    private TextView txtNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad012);
        btnAceptar = (Button) findViewById(R.id.aceptar);
        btnRechazar = (Button) findViewById(R.id.rechazar);
        txtNombre = (TextView) findViewById(R.id.textView);
        Bundle extras = getIntent().getExtras();
        String nom = extras.getString("Nombre");
        String ape = extras.getString("Apellido");
        txtNombre.getText().toString();
        eventos();
    }
    private void  eventos(){
        btnRechazar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnAceptar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            }
        });
    }

}
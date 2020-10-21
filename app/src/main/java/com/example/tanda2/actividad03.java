package com.example.tanda2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class actividad03 extends AppCompatActivity {

    private Button btnEnviar;
    private EditText txtNombre,txtApellido;
    private RadioButton masc,fem;
    private CheckBox musi,lect,depor,viaj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad03);
        txtNombre = (EditText) findViewById(R.id.Nom);
        txtApellido = (EditText) findViewById(R.id.Ape);
        masc = (RadioButton) findViewById(R.id.rdMasc);
        fem = (RadioButton) findViewById(R.id.rdFeme);
        btnEnviar = (Button) findViewById(R.id.Ver);
        musi = (CheckBox) findViewById(R.id.chkMarcame1);
        lect = (CheckBox) findViewById(R.id.chkMarcame2);
        depor = (CheckBox) findViewById(R.id.chkMarcame3);
        viaj = (CheckBox) findViewById(R.id.chkMarcame4);
        View.OnClickListener list = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String opcion = "";
                switch (view.getId()) {
                    case R.id.rdMasc:
                        if (fem.isChecked()){
                            fem.setChecked(false);
                        }
                        break;
                    case R.id.rdFeme:
                        if (masc.isChecked()){
                            masc.setChecked(false);
                        }
                        break;
                }
            }
        };
        fem.setOnClickListener(list);
        masc.setOnClickListener(list);
        fem.setChecked(true);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(actividad03.this,actividad031.class);
                ArrayList<String> lista = new ArrayList<String>();

                lista.add(txtNombre.getText().toString());
                lista.add(txtApellido.getText().toString());
                if(masc.isChecked()) {
                    lista.add("Masculino");
                }else {
                    lista.add("Femenino");
                }
                if(musi.isChecked()){
                    lista.add(musi.getText().toString());
                }
                if(depor.isChecked()){
                    lista.add(depor.getText().toString());
                }
                if(lect.isChecked()){
                    lista.add(lect.getText().toString());
                }
                if(viaj.isChecked()){
                    lista.add(viaj.getText().toString());
                }
                i.putExtra("lista",lista);
                startActivity(i);
            }
        });

    }



}
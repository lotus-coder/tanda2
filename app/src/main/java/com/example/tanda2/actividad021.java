package com.example.tanda2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class actividad021 extends AppCompatActivity {

    private Button volver;
    private TextView resp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad021);
        volver = (Button) findViewById(R.id.volv);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }
        });
        resp = (TextView) findViewById(R.id.resp);
        Bundle extras = getIntent().getExtras();
        if(extras.getBoolean("resul")){
            resp.setText("CORRECTO");
        }else{
            resp.setText("INCORRECTO");
        }
    }


}
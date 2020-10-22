package com.example.tanda2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class actividad04 extends AppCompatActivity {

    private Button botonsito;
    private EditText edad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad04);
        botonsito = (Button) findViewById(R.id.Verify);
        edad = (EditText) findViewById(R.id.Edad);

        botonsito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(actividad04.this,actividad041.class);

                if(Integer.parseInt(edad.getText().toString())>17){
                   i.putExtra("Edad",true);
                }else{
                    i.putExtra("Edad",false);
                }
                startActivity(i);
            }
        });
    }


}
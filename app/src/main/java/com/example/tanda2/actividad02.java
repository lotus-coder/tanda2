package com.example.tanda2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class actividad02 extends AppCompatActivity {

    private TextView num1,num2,correctas,incorrectas ;
    private EditText resultado;
    private Button verResul;
    private int cor,incor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad02);
        num1 = (TextView) findViewById(R.id.num1);
        num2 = (TextView) findViewById(R.id.num2);
        num1.setText(""+(int)(Math.random() * (100 + 1)));
        num2.setText(( ("" +(int) (Math.random() * (100 + 1)))));
        resultado = (EditText) findViewById(R.id.resultado);
        verResul = (Button) findViewById(R.id.comprobar);
        correctas = (TextView) findViewById(R.id.correctas);
        incorrectas = (TextView) findViewById(R.id.incorrectas);
        cor=0;
        incor=0;
        eventos();
    }

    private void eventos() {
        verResul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(actividad02.this,actividad021.class);
                int res = Integer.parseInt(num1.getText().toString())+Integer.parseInt(num2.getText().toString());
                if(Integer.parseInt(resultado.getText().toString())==res){
                    in.putExtra("resul",true);
                    cor++;
                    correctas.setText(""+cor);
                }else{
                    in.putExtra("resul",false);
                    incor++;
                    incorrectas.setText(""+incor);
                }
                startActivityForResult(in,1);
            }
        });
    }
    protected void onActivityResult (int requestCode, int resultCode,Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK) {
            num1.setText(""+(int)(Math.random() * (100 + 1)));
            num2.setText(( ("" +(int) (Math.random() * (100 + 1)))));
            resultado.setText("");
        }
    }
}
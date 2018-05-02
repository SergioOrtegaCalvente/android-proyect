package com.teaching.android.miprimeraapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText valor1;
    private EditText valor2;
    private TextView resultado, textView,textView2;
    private Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1=findViewById(R.id.valor1);
        valor2=findViewById(R.id.valor2);
        resultado=findViewById(R.id.resultado);
    }
    public void sumar(View view){
        String valor1=this.valor1.getText().toString();
        String valor2=this.valor2.getText().toString();
        int pasarValor1=Integer.parseInt(valor1);
        int pasarValor2=Integer.parseInt(valor2);
        int resu=pasarValor1+pasarValor2;
        String resul=String.valueOf(resu);
        this.resultado.setText(resul);

    }
}

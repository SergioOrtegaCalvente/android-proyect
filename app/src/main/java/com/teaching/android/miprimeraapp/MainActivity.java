package com.teaching.android.miprimeraapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText valor1;
    private EditText valor2;
    private TextView resultado, textView,textView2;
    private Button boton,navegador,llamar;
    private static String resultad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navegador=findViewById(R.id.navegador);
        llamar=findViewById(R.id.llamar);
        valor1=findViewById(R.id.valor1);
        valor2=findViewById(R.id.valor2);
        Log.d("MainActivity","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity","onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity","onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity","onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity","onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity","onDestroy");
    }

    public void sumar(View view){
        String valor1=this.valor1.getText().toString();
        String valor2=this.valor2.getText().toString();
        int pasarValor1=Integer.parseInt(valor1);
        int pasarValor2=Integer.parseInt(valor2);
        int resu=pasarValor1+pasarValor2;
        String resul=String.valueOf(resu);
        resultad=resul;
        Intent a=new Intent(this, Main2Activity.class);
        startActivity(a);

    }
    public void navegador(View view){
        Uri a=Uri.parse("http://www.google.es");
        Intent b=new Intent(Intent.ACTION_VIEW,a);
        startActivity(b);
    }
    public void telefono(View view){
        Intent a=new Intent(Intent.ACTION_DIAL,Uri.parse("tel:1234"));

        startActivity(a);
    }

    public String getResultad() {
        return resultad;
    }
}

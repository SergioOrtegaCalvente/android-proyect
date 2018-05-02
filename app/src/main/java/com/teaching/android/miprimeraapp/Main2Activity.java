package com.teaching.android.miprimeraapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        MainActivity c=new MainActivity();
        a=findViewById(R.id.textView4);
        b=findViewById(R.id.textView6);
        a.setText(c.getResultad());
        b.setText(getIntent().getStringExtra("valor"));
    }
}

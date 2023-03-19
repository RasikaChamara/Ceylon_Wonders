package com.rasikaarc.ceylonwonders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Nature extends AppCompatActivity {
    ImageButton btnBack;
    Button btnSin,btnYala,btnBund,btnMee,btnAsu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nature);

        btnBack=(ImageButton) findViewById(R.id.btnBack);
        btnSin=(Button) findViewById(R.id.btnSin);
        btnYala=(Button) findViewById(R.id.btnYala);
        btnBund=(Button) findViewById(R.id.btnBund);
        btnMee=(Button) findViewById(R.id.btnMee);
        btnAsu=(Button) findViewById(R.id.btnAsu);


        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent isi=new Intent(Nature.this,Sinharaja.class);
                startActivity(isi);
            }
        });

        btnYala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent iy=new Intent(Nature.this,Yala.class);
                startActivity(iy);
            }
        });

        btnBund.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent ibu=new Intent(Nature.this,Bundala.class);
                startActivity(ibu);
            }
        });

        btnMee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent im=new Intent(Nature.this,Meemure.class);
                startActivity(im);
            }
        });

        btnAsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent ias=new Intent(Nature.this,Asupini.class);
                startActivity(ias);
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Nature.this,Home.class);
                startActivity(i);
            }
        });
    }
}
package com.rasikaarc.ceylonwonders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Seaside extends AppCompatActivity {
    ImageButton btnBack;
    Button btnHik,btnUna,btnAru,btnKog,btnTrin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seaside);

        btnBack=(ImageButton) findViewById(R.id.btnBack);
        btnHik=(Button) findViewById(R.id.btnHik);
        btnUna=(Button) findViewById(R.id.btnUna);
        btnAru=(Button) findViewById(R.id.btnAru);
        btnKog=(Button) findViewById(R.id.btnKog);
        btnTrin=(Button) findViewById(R.id.btnTrin);


        btnHik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent isi=new Intent(Seaside.this,Hikkaduwa.class);
                startActivity(isi);
            }
        });

        btnUna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iy=new Intent(Seaside.this,Unawatuna.class);
                startActivity(iy);
            }
        });

        btnAru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ibu=new Intent(Seaside.this,Arugam.class);
                startActivity(ibu);
            }
        });

        btnKog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent im=new Intent(Seaside.this,Koggala.class);
                startActivity(im);
            }
        });

        btnTrin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ias=new Intent(Seaside.this,Trinco.class);
                startActivity(ias);
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Seaside.this,Home.class);
                startActivity(i);
            }
        });
    }
}
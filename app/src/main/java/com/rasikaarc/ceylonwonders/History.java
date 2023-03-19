package com.rasikaarc.ceylonwonders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class History extends AppCompatActivity {
    ImageButton btnBack;
    Button btnSig,btnKan,btnGall,btnAnu,btnPol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        btnBack=(ImageButton) findViewById(R.id.btnBack);
        btnSig=(Button) findViewById(R.id.btnSig);
        btnKan=(Button) findViewById(R.id.btnKan);
        btnGall=(Button) findViewById(R.id.btnGall);
        btnAnu=(Button) findViewById(R.id.btnAnu);
        btnPol=(Button) findViewById(R.id.btnPol);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(History.this,Home.class);
                startActivity(i);
            }
        });

        btnSig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent isi=new Intent(History.this,Sigiriya.class);
                startActivity(isi);
            }
        });

        btnKan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iy=new Intent(History.this,Kandy.class);
                startActivity(iy);
            }
        });

        btnGall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ibu=new Intent(History.this,Galle.class);
                startActivity(ibu);
            }
        });

        btnAnu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent im=new Intent(History.this,Anurad.class);
                startActivity(im);
            }
        });

        btnPol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ias=new Intent(History.this,Polonn.class);
                startActivity(ias);
            }
        });
    }

}
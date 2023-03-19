package com.rasikaarc.ceylonwonders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Unawatuna extends AppCompatActivity {
    ImageButton btnBack,btnHome,btnMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unawatuna);

        btnBack=(ImageButton) findViewById(R.id.btnBack);
        btnHome=(ImageButton) findViewById(R.id.btnHome);
        btnMap=(ImageButton) findViewById(R.id.btnMap);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Unawatuna.this,Seaside.class);
                startActivity(i);
            }
        });

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ih=new Intent(Unawatuna.this,Home.class);
                startActivity(ih);
            }
        });

        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent im=new Intent(Unawatuna.this,Unamap.class);
                startActivity(im);
            }
        });
    }
}
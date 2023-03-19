package com.rasikaarc.ceylonwonders;

import androidx.appcompat.app.AppCompatActivity;

import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;


public class Home extends AppCompatActivity {
     ImageButton btnNature,btnAbt,btnHis,btnBch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home);
        //button definition
        btnNature=(ImageButton) findViewById(R.id.btnNat);
        btnAbt=(ImageButton)findViewById(R.id.btnAbt);
        btnHis=(ImageButton)findViewById(R.id.btnHis);
        btnBch=(ImageButton)findViewById(R.id.btnBch);

        //button connections
        btnNature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentNew=new Intent(Home.this,Nature.class);

                startActivity(intentNew);
            }
        });

        btnAbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Home.this,About.class);
                startActivity(i);
            }
        });

        btnHis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Home.this,History.class);
                startActivity(i1);
            }
        });

        btnBch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(Home.this,Seaside.class);
                startActivity(i2);
            }
        });

    }

}
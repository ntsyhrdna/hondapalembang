package com.pab.hondapalembang;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lestarimotorindo extends AppCompatActivity {
    Button btn_lokasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lestari);
        btn_lokasi= findViewById(R.id.btn_lokasi);
        btn_lokasi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent PINDAH = new Intent(lestarimotorindo.this, lestarimaps.class);
                startActivity(PINDAH);

            }

        });
    }
}
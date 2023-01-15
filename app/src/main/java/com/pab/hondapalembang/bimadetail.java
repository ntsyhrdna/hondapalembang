package com.pab.hondapalembang;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bimadetail extends AppCompatActivity {
    Button btn_maps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bimadetail);
        btn_maps = findViewById(R.id.btn_lokasi);
        btn_maps.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent PINDAH = new Intent(bimadetail.this, bimamaps.class);
                startActivity(PINDAH);

            }

        });
    }
}

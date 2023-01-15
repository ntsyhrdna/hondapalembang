package com.pab.hondapalembang;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class honda extends AppCompatActivity {
    Button btn_detail,btn2_detail,btn3_detail,btn4_detail,btn5_detail,btn6_detail,btn7_detail,btn8_detail,btn9_detail,btn10_detail;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.about,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()== R.id.item1){
            startActivity(new Intent(honda.this, about.class));
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_honda);
        btn_detail = (Button) findViewById(R.id.btn_detail);
        btn2_detail = (Button) findViewById(R.id.btn_detail2);
        btn3_detail = (Button) findViewById(R.id.btn_detail3);
        btn4_detail = (Button) findViewById(R.id.btn_detail4);
        btn5_detail = (Button) findViewById(R.id.btn_detail5);
        btn6_detail = (Button) findViewById(R.id.btn_detail6);
        btn7_detail = (Button) findViewById(R.id.btn_detail7);
        btn8_detail = (Button) findViewById(R.id.btn_detail8);
        btn9_detail = (Button) findViewById(R.id.btn_detail9);
        btn10_detail = (Button) findViewById(R.id.btn_detail10);
        btn_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PINDAH = new Intent(honda.this, bimadetail.class);
                startActivity(PINDAH);
            }
        });
        btn2_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PINDAH = new Intent(honda.this,astraplaju.class);
                startActivity(PINDAH);
            }
        });
        btn3_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PINDAH = new Intent(honda.this, kencana.class);
                startActivity(PINDAH);
            }
        });

        btn4_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PINDAH = new Intent(honda.this, lestarimotorindo.class);
                startActivity(PINDAH);
            }
        });
        btn5_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PINDAH = new Intent(honda.this, ahas.class);
                startActivity(PINDAH);
            }
        });
        btn6_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PINDAH = new Intent(honda.this, astrakm9.class);
                startActivity(PINDAH);
            }
        });
        btn7_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PINDAH = new Intent(honda.this, sako.class);
                startActivity(PINDAH);
            }
        });
        btn8_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PINDAH = new Intent(honda.this, taa.class);
                startActivity(PINDAH);
            }
        });
        btn9_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PINDAH = new Intent(honda.this, veteran.class);
                startActivity(PINDAH);
            }
        });
        btn10_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PINDAH = new Intent(honda.this, angkasa.class);
                startActivity(PINDAH);
            }
        });
    }
}
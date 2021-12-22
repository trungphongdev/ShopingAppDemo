package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Boloctimkiem extends AppCompatActivity {
    TextView txvdanhmucsp,txvdanhmucgiaban,txvApdungdanhmuc,txvdanhmucthuonghieu;
    String DATATIMKIEM = "data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boloctimkiem);
        txvdanhmucsp = findViewById(R.id.txvdanhmucsp);
        txvdanhmucgiaban = findViewById(R.id.txvdanhmucgiaban);
        txvApdungdanhmuc = findViewById(R.id.txvDanhmucapdung);
        txvdanhmucthuonghieu = findViewById(R.id.txvdanhmucthuonghieu);
        txvdanhmucsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txvdanhmucsp.setTextColor(Color.parseColor("#FFFFFF"));
                txvdanhmucsp.setBackgroundResource(R.drawable.design_trendbanner);
            }
        });
        txvdanhmucgiaban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txvdanhmucgiaban.setTextColor(Color.parseColor("#FFFFFF"));
                txvdanhmucgiaban.setBackgroundResource(R.drawable.design_trendbanner);
            }
        });
        txvdanhmucthuonghieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txvdanhmucthuonghieu.setTextColor(Color.parseColor("#FFFFFF"));
                txvdanhmucthuonghieu.setBackgroundResource(R.drawable.design_trendbanner);
            }
        });
        txvApdungdanhmuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Boloctimkiem.this,HomeActivity.class).putExtra(DATATIMKIEM,"data");
                startActivity(intent);

            }
        });
    }

    public void backTimkiem(View view) {
        startActivity(new Intent(Boloctimkiem.this,HomeActivity.class).putExtra("boloc",2));
    }
}
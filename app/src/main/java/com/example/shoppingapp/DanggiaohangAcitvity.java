package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DanggiaohangAcitvity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danggiaohang);
    }

    public void backDangiao(View view) {
        startActivity(new Intent(DanggiaohangAcitvity.this,AccountAcitvity.class));

    }

    public void Dangiaohang_DGH(View view) {
    }

    public void Choxacnhan_DGH(View view) {
        startActivity(new Intent(DanggiaohangAcitvity.this,ChoxacnhanActivity.class));

    }

    public void daHoanThanh_DGH(View view) {
        startActivity(new Intent(DanggiaohangAcitvity.this,DahoanthanhActivity.class));

    }
}
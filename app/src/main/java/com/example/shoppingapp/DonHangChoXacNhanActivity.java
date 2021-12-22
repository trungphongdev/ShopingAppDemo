package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DonHangChoXacNhanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_don_hang_cho_xac_nhan);
    }

    public void backDangchoXacnhan(View view) {
        startActivity(new Intent(DonHangChoXacNhanActivity.this,ChoxacnhanActivity.class));
    }
}
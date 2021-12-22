package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Thanhtoanthanhcong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanhtoanthanhcong);
    }

    public void eventThanhtoanthanhcong(View view) {
        startActivity(new Intent(Thanhtoanthanhcong.this,DonHangChoXacNhanActivity.class));
    }
}
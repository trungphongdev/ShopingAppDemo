package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Authenticbanking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authenticbanking);
    }

    public void eventXacnhanBanking(View view) {
        startActivity(new Intent(Authenticbanking.this,Thanhtoanthanhcong.class));
    }

    public void backAuthenbanking(View view) {
        onBackPressed();
    }
}
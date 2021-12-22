package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Themtaikhoannganhanglienket extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themtaikhoannganhanglienket);
    }

    public void backThemtkbanking(View view) {
        onBackPressed();
    }

    public void eventclickbanking(View view) {
        startActivity(new Intent(Themtaikhoannganhanglienket.this,VCBPaymentActivity.class));

    }
}
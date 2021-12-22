package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VCBPaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vcbpayment);
    }

    public void eventbtnDongylienket(View view) {
        startActivity(new Intent(VCBPaymentActivity.this,AssociateBankingActivity.class));
    }
}
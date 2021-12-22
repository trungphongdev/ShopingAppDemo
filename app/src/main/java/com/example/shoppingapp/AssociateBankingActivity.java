package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AssociateBankingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_associate_banking);
    }



    public void evetnlienketnganhangthanhcong(View view) {
        startActivity(new Intent(AssociateBankingActivity.this,AccountAcitvity.class));
    }
}
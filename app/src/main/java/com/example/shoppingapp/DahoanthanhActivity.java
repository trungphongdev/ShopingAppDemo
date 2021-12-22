package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DahoanthanhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dahoanthanh);
    }


    public void choxacnhan_DHT(View view) {
        startActivity(new Intent(DahoanthanhActivity.this,ChoxacnhanActivity.class));

    }

    public void dangiao_DHT(View view) {
        startActivity(new Intent(DahoanthanhActivity.this,DanggiaohangAcitvity.class));

    }

    public void backdahoanthanh(View view) {
        startActivity(new Intent(DahoanthanhActivity.this,AccountAcitvity.class));

    }

    public void mualai(View view) {
        startActivity(new Intent(DahoanthanhActivity.this,ThanhtoanAcitvity.class));

    }
}
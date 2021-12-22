package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ChoxacnhanActivity extends AppCompatActivity {
    private  TextView txv_choxacnhan,txv_dangiao,txv_dahoanthanh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choxacnhan);
        txv_choxacnhan = findViewById(R.id.txvchoxacnhan_cxn);
        txv_dahoanthanh = findViewById(R.id.txvdahoanthanh_CXN);
        txv_dangiao = findViewById(R.id.txvdanggiao_cxn);
    }

    public void backChoxacnhan(View view) {
        startActivity(new Intent(ChoxacnhanActivity.this,AccountAcitvity.class));
    }

    public void dahoanthanhCXN(View view) {
        startActivity(new Intent(ChoxacnhanActivity.this,DahoanthanhActivity.class));

    }

    public void dangiao_CXN(View view) {
        startActivity(new Intent(ChoxacnhanActivity.this,DanggiaohangAcitvity.class));
    }

    public void choxacnhan_CXN(View view) {
        startActivity(new Intent(ChoxacnhanActivity.this,ChoxacnhanActivity.class));

    }


    public void chatchoxacnhan(View view) {
        startActivity(new Intent(ChoxacnhanActivity.this,ChatActivity.class));

    }
}
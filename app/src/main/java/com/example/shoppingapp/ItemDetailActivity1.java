package com.example.shoppingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ItemDetailActivity1 extends AppCompatActivity {
ImageView imgLike1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail1);
        imgLike1 = findViewById(R.id.imgLike1);
    }



    public void backItemDetail(View view) {
        onBackPressed();
    }

    public void AddItemstoyourcard1(View view) {
        startActivity(new Intent(ItemDetailActivity1.this,AddItemtoCartActivity.class));

    }

    public void MuaItems1(View view) {
        startActivity(new Intent(ItemDetailActivity1.this,ThanhtoanAcitvity.class));


    }

    public void vaoGiohang1(View view) {
        startActivity(new Intent(ItemDetailActivity1.this,AddItemtoCartActivity.class));

    }

    public void likeItem1(View view) {
        imgLike1.setImageResource(R.drawable.ic_baseline_favorite_24);
    }
}
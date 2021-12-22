package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ItemDetailActivity extends AppCompatActivity {
    ImageView imgLIke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);
        imgLIke = findViewById(R.id.imgLike);
    }

    public void backItemDetail(View view) {
        onBackPressed();
    }

    public void AddItemstoyourcard(View view) {
        startActivity(new Intent(ItemDetailActivity.this,AddItemtoCartActivity.class));
    }

    public void MuaItems(View view) {
        startActivity(new Intent(ItemDetailActivity.this,ThanhtoanAcitvity.class));
    }

    public void vaoGiohang(View view) {
        startActivity(new Intent(ItemDetailActivity.this,AddItemtoCartActivity.class));
    }

    public void likeItem(View view) {
        imgLIke.setImageResource(R.drawable.ic_baseline_favorite_24);
    }
}
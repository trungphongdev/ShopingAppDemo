package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LibaryCamera extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libary_camera);
    }

    public void backAlbumAnh(View view) {
        onBackPressed();
    }

    public void chonAnh(View view) {
        startActivity(new Intent(LibaryCamera.this,DetailPictureActivity.class));
    }
}
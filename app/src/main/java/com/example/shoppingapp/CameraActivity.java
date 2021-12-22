package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CameraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
    }

    public void openImages(View view) {
        startActivity(new Intent(CameraActivity.this,LibaryCamera.class));
    }

    public void closeCamera(View view) {
       onBackPressed();
    }
}
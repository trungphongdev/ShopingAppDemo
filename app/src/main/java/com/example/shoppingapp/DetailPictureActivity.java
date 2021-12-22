package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DetailPictureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_picture);
    }

    public void taiAnhlen(View view) {
        Intent intent = new Intent(DetailPictureActivity.this,HomeActivity.class).putExtra("DATA",1);
        startActivity(intent);

    }

    public void backCamera(View view) {
        startActivity(new Intent(DetailPictureActivity.this,CameraActivity.class));
        Toast.makeText(DetailPictureActivity.this,"Hủy tải lên",Toast.LENGTH_SHORT).show();
    }
}
package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ConstraintLayout layout = findViewById(R.id.layout_signup);


    }

    public void backDangki(View view) {
        startActivity(new Intent(SignUpActivity.this,SignInActivity.class));

    }

    public void dangkiTaikhoan(View view) {
        startActivity(new Intent(SignUpActivity.this,AuthenticActivity.class));
    }
}
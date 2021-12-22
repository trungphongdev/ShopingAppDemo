package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AuthenticActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentic);

    }

    public void backAuthentic(View view) {
        startActivity(new Intent(AuthenticActivity.this,SignInActivity.class));
    }



    public void xacnhanDK(View view) {
        startActivity(new Intent(AuthenticActivity.this,SuccessSignUpActivity.class));

    }
}
package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class WelcomActivity extends AppCompatActivity {
private ImageView imgLogo;
private TextView txvNamewelcom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        imgLogo = findViewById(R.id.imageLogoWelcom);
        txvNamewelcom = findViewById(R.id.txvNameWelcome);
        ConstraintLayout layout = findViewById(R.id.layout_welcome);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WelcomActivity.this,SignInActivity.class));
            }
        });
        animlogo();

    }


    private void animlogo() {
        Animation anim = AnimationUtils.loadAnimation(this,R.anim.animlogo);
        txvNamewelcom.startAnimation(anim);
        imgLogo.setAnimation(anim);
        new CountDownTimer(2000,1000) {

            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                startActivity(new Intent(WelcomActivity.this,SignInActivity.class));

            }
        }.start();

    }
}
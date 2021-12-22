package com.example.shoppingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class TrendingActivity extends AppCompatActivity {
    ConstraintLayout layoutTatcaTrending,layoutReviewTrending,layoutCamnang;
    TextView txvTatca,txvReview,txvCamnang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trending);
        txvTatca = findViewById(R.id.txvTatcaTrending);
        txvReview = findViewById(R.id.txvReviewTrending);
        txvCamnang = findViewById(R.id.txvCamnangTrending);

        layoutTatcaTrending = findViewById(R.id.layoutTatcaTrending);
        layoutReviewTrending = findViewById(R.id.layoutReviewTrending);
        layoutCamnang = findViewById(R.id.layoutCamnang);

        BottomNavigationView navHome = findViewById(R.id.nav_trend);
        navHome.setSelectedItemId(R.id.itemTrend);
        navHome.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.itemHome: {
                        startActivity(new Intent(TrendingActivity.this,HomeActivity.class));
                        return true;
                    }
                    case R.id.itemPromote: {
                        startActivity(new Intent(TrendingActivity.this,ActivityPromote.class));
                        return true;
                    }
                    case R.id.itemTrend: {
                        Toast.makeText(TrendingActivity.this,"Bạn đang ở trang xu hướng",Toast.LENGTH_SHORT).show();
                        return true;
                    }
                    case R.id.itemUser: {
                        startActivity(new Intent(TrendingActivity.this,AccountAcitvity.class));
                        return true;
                    }
                }
                return false;
            }
        });
    }

    public void tatcaTrending_Function(View view) {
        layoutTatcaTrending.setVisibility(View.VISIBLE);
        layoutReviewTrending.setVisibility(View.GONE);
        layoutCamnang.setVisibility(View.GONE);
        txvTatca.setBackgroundResource(R.drawable.design_trendbanner);
        txvReview.setBackgroundResource(R.drawable.design_trendbanner2);
        txvCamnang.setBackgroundResource(R.drawable.design_trendbanner2);
    }

    public void reviewTrending_Function(View view) {

        layoutReviewTrending.setVisibility(View.VISIBLE);
        layoutTatcaTrending.setVisibility(View.GONE);
        layoutCamnang.setVisibility(View.GONE);
        txvReview.setBackgroundResource(R.drawable.design_trendbanner);
        txvTatca.setBackgroundResource(R.drawable.design_trendbanner2);
        txvCamnang.setBackgroundResource(R.drawable.design_trendbanner2);
    }

    public void camNangFunction(View view) {
        layoutCamnang.setVisibility(View.VISIBLE);
        layoutTatcaTrending.setVisibility(View.GONE);
        layoutReviewTrending.setVisibility(View.GONE);
        txvReview.setBackgroundResource(R.drawable.design_trendbanner2);
        txvTatca.setBackgroundResource(R.drawable.design_trendbanner2);
        txvCamnang.setBackgroundResource(R.drawable.design_trendbanner);
    }
}
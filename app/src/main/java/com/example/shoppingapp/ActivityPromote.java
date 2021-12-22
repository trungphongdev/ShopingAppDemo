package com.example.shoppingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class ActivityPromote extends AppCompatActivity {
   private LinearLayout layoutHotDealPromote;
   private LinearLayout layoutFlashSealPromote;
   TextView txvHotDeals,txvFlashSeals;
   private CustomAdapterDetail adapter;
   private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promote);
        BottomNavigationView navHome = findViewById(R.id.nav_promote);
        ArrayList<ModelItemDetail> items = getList1();
        adapter = new CustomAdapterDetail(items,this);
        recyclerView = findViewById(R.id.recyclerFlasale);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        layoutHotDealPromote = findViewById(R.id.layouthotdeals);
        layoutFlashSealPromote = findViewById(R.id.layoutFlashsalePromote);
        txvFlashSeals = findViewById(R.id.txvflashealPromote);
        txvHotDeals = findViewById(R.id.txvhotdealPromote);
        navHome.setSelectedItemId(R.id.itemPromote);
        navHome.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.itemHome: {
                        startActivity(new Intent(ActivityPromote.this,HomeActivity.class));
                        return true;
                    }
                    case R.id.itemPromote: {
                        Toast.makeText(ActivityPromote.this,"Bạn đang ở trang khuyến mại",Toast.LENGTH_SHORT).show();
                        navHome.setActivated(true);
                        return true;
                    }
                    case R.id.itemTrend: {
                        startActivity(new Intent(ActivityPromote.this,TrendingActivity.class));
                        return true;
                    }
                    case R.id.itemUser: {
                        startActivity(new Intent(ActivityPromote.this,AccountAcitvity.class));
                        return true;
                    }
                }
                return false;
            }
        });

    }

    public void giohangPromote(View view) {
        startActivity(new Intent(ActivityPromote.this,AddItemtoCartActivity.class));
    }

    public void chatShopPromote(View view) {
        startActivity(new Intent(ActivityPromote.this,ChatActivity.class));
    }

    public void hotdealsFunction(View view) {
        txvHotDeals.setBackgroundResource(R.color.color_main);
        txvFlashSeals.setBackgroundResource(R.color.color_sub);
        layoutHotDealPromote.setVisibility(View.VISIBLE);
        layoutFlashSealPromote.setVisibility(View.INVISIBLE);
    }

    public void flash_sealFunction(View view) {
        txvHotDeals.setBackgroundResource(R.color.color_sub);
        txvFlashSeals.setBackgroundResource(R.color.color_main);
        layoutHotDealPromote.setVisibility(View.INVISIBLE);
        layoutFlashSealPromote.setVisibility(View.VISIBLE);
    }
    private ArrayList<ModelItemDetail> getList1() {
        ArrayList<ModelItemDetail> list = new ArrayList<ModelItemDetail>();
        list.add(new ModelItemDetail("Kem Bio Cream khoáng chất thiên nhiên","Giảm 30k","đ200.000","đ170.000","Đã bán 500", R.drawable.imgbiocream,R.drawable.fivestar));
        list.add(new ModelItemDetail("Sữa rửa mặt Murad vitamin C 200ml","Giảm 75k","đ290.000","đ215.000","Đã bán 80", R.drawable.murad,R.drawable.threestar));
        list.add(new ModelItemDetail("Sữa tắm ngọc trai Vaselin","Giảm 81k","đ500.000","đ419.000","Đã bán 20", R.drawable.vaselin,R.drawable.fourstar));
        list.add(new ModelItemDetail("Kem trị mụn obagi siêu xịn","Giảm 70k","đ320.000","đ250.000","Đã bán 400", R.drawable.phan,R.drawable.fivestar));
        list.add(new ModelItemDetail("Phấn Niềm mịn lì Maybeline Fitme","Giảm 20k","đ510.000","đ490.000","Đã bán 60",R.drawable.maybelin2,R.drawable.twostar));
        list.add(new ModelItemDetail("Sữa tắm kháng khuẩn Maybeline Extra","Giảm 46k","đ170.000","đ124.000","Đã bán 99",R.drawable.maybelin6,R.drawable.twostar));
        list.add(new ModelItemDetail("Sữa tắm kháng khuẩn Maybeline Extra","Giảm 46k","đ170.000","đ124.000","Đã bán 99",R.drawable.maybelin6,R.drawable.fivestar));        list.add(new ModelItemDetail("Sữa tắm trẻ em Babyskin Maybeline","Giảm 44k","đ288.000","đ244.000","Đã bán 459", R.drawable.matna1,R.drawable.fivestar));
        list.add(new ModelItemDetail("Son dưỡng Maybeline siêu thơm","Giảm 48k","đ680.000","đ600.000","Đã bán 109", R.drawable.son,R.drawable.fivestar));
        list.add(new ModelItemDetail("Sữa tắm kháng khuẩn Maybeline Extra","Giảm 46k","đ170.000","đ124.000","Đã bán 99",R.drawable.maybelin6,R.drawable.fivestar));
        return list;
    }

    public void openCameraPromote(View view) {
        startActivity(new Intent(ActivityPromote.this,CameraActivity.class));
    }
}
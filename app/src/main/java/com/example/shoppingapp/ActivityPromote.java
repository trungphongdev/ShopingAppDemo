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
                        Toast.makeText(ActivityPromote.this,"B???n ??ang ??? trang khuy???n m???i",Toast.LENGTH_SHORT).show();
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
        list.add(new ModelItemDetail("Kem Bio Cream kho??ng ch???t thi??n nhi??n","Gi???m 30k","??200.000","??170.000","???? b??n 500", R.drawable.imgbiocream,R.drawable.fivestar));
        list.add(new ModelItemDetail("S???a r???a m???t Murad vitamin C 200ml","Gi???m 75k","??290.000","??215.000","???? b??n 80", R.drawable.murad,R.drawable.threestar));
        list.add(new ModelItemDetail("S???a t???m ng???c trai Vaselin","Gi???m 81k","??500.000","??419.000","???? b??n 20", R.drawable.vaselin,R.drawable.fourstar));
        list.add(new ModelItemDetail("Kem tr??? m???n obagi si??u x???n","Gi???m 70k","??320.000","??250.000","???? b??n 400", R.drawable.phan,R.drawable.fivestar));
        list.add(new ModelItemDetail("Ph???n Ni???m m???n l?? Maybeline Fitme","Gi???m 20k","??510.000","??490.000","???? b??n 60",R.drawable.maybelin2,R.drawable.twostar));
        list.add(new ModelItemDetail("S???a t???m kh??ng khu???n Maybeline Extra","Gi???m 46k","??170.000","??124.000","???? b??n 99",R.drawable.maybelin6,R.drawable.twostar));
        list.add(new ModelItemDetail("S???a t???m kh??ng khu???n Maybeline Extra","Gi???m 46k","??170.000","??124.000","???? b??n 99",R.drawable.maybelin6,R.drawable.fivestar));        list.add(new ModelItemDetail("S???a t???m tr??? em Babyskin Maybeline","Gi???m 44k","??288.000","??244.000","???? b??n 459", R.drawable.matna1,R.drawable.fivestar));
        list.add(new ModelItemDetail("Son d?????ng Maybeline si??u th??m","Gi???m 48k","??680.000","??600.000","???? b??n 109", R.drawable.son,R.drawable.fivestar));
        list.add(new ModelItemDetail("S???a t???m kh??ng khu???n Maybeline Extra","Gi???m 46k","??170.000","??124.000","???? b??n 99",R.drawable.maybelin6,R.drawable.fivestar));
        return list;
    }

    public void openCameraPromote(View view) {
        startActivity(new Intent(ActivityPromote.this,CameraActivity.class));
    }
}
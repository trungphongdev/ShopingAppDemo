package com.example.shoppingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class AccountAcitvity extends AppCompatActivity {
ImageView imgSeting;
DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_acitvity);
        BottomNavigationView navHome = findViewById(R.id.nav_user);
        navHome.setSelectedItemId(R.id.itemUser);
        navHome.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.itemHome: {
                        startActivity(new Intent(AccountAcitvity.this,HomeActivity.class));
                        return true;
                    }
                    case R.id.itemPromote: {
                        startActivity(new Intent(AccountAcitvity.this,ActivityPromote.class));
                        return true;
                    }
                    case R.id.itemTrend: {
                        startActivity(new Intent(AccountAcitvity.this,TrendingActivity.class));
                        return true;
                    }
                    case R.id.itemUser: {
                        Toast.makeText(AccountAcitvity.this,"Bạn đang ở trang cá nhân",Toast.LENGTH_SHORT).show();
                        return true;
                    }
                }
                return false;
            }
        });
        drawerLayout = findViewById(R.id.drawerlayout);
        imgSeting = findViewById(R.id.imgSetting);
        imgSeting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(Gravity.LEFT);
            }
        });

    }

    public void eventDangxuat(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.create();
        builder.setTitle("Đăng xuất !!!");
        builder.setMessage("Bạn có chắc muốn đăng xuất không");
        builder.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                startActivity(new Intent(AccountAcitvity.this,SignInActivity.class));
            }
        });
        builder.setNegativeButton("Hủy bỏ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.show();

    }

    public void eventVoucher(View view) {
        startActivity(new Intent(AccountAcitvity.this,VoucherActivity.class));
    }

    public void eventChoxacnhan(View view) {
        startActivity(new Intent(AccountAcitvity.this,ChoxacnhanActivity.class));
    }


    public void eventDanggiao(View view) {
        startActivity(new Intent(AccountAcitvity.this,DanggiaohangAcitvity.class));

    }

    public void eventDahoanthanh(View view) {
        startActivity(new Intent(AccountAcitvity.this,DahoanthanhActivity.class));
    }

    public void diachiGiaohang(View view) {
        startActivity(new Intent(AccountAcitvity.this,DeliveryAdressActivity.class));
    }

    public void hoSocuaToi(View view) {
        startActivity(new Intent(AccountAcitvity.this,DocumentAcountActivity.class));
    }

    public void thayDoiMatKhau(View view) {
        startActivity(new Intent(AccountAcitvity.this,ChangPasswordAcitvity.class));
    }

    public void eventLienketNganhang(View view) {
        startActivity(new Intent(AccountAcitvity.this,Themtaikhoannganhanglienket.class));

    }
}
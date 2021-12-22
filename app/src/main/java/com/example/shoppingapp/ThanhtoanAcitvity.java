package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class ThanhtoanAcitvity extends AppCompatActivity {
    CheckBox cbThanhtoan,cbQuathe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanhtoan_acitvity);
        cbThanhtoan = findViewById(R.id.cbThanhtoanNhanhang);
        cbQuathe = findViewById(R.id.cbThanhtoanquathe);
        cbThanhtoan.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                cbQuathe.setChecked(false);
            }
        });
        cbQuathe.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                cbThanhtoan.setChecked(false);
            }
        });
    }

    public void backThanhtoan(View view) {
        onBackPressed();
    }

    public void DatHangThanhtoan(View view) {
        if(cbThanhtoan.isChecked() == false && cbQuathe.isChecked() == false) {
            Toast.makeText(ThanhtoanAcitvity.this,"Vui lòng chọn hình thức thanh toán",Toast.LENGTH_SHORT).show();
        }
        if(cbThanhtoan.isChecked() == true) {
            startActivity(new Intent(ThanhtoanAcitvity.this,DonHangChoXacNhanActivity.class));
        }
        if(cbQuathe.isChecked() == true) {
            startActivity(new Intent(ThanhtoanAcitvity.this,Authenticbanking.class));
        }
    }
}
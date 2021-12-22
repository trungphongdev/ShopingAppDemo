package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class AddItemtoCartActivity extends AppCompatActivity {
    private  CheckBox cb1,cb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_itemto_cart);
        cb1 = findViewById(R.id.checkboxItem1);
        cb2 = findViewById(R.id.checkboxItem2);
    }

    public void handlerBackItemtoCard(View view) {
       onBackPressed();
    }


    public void dathangCart(View view) {
        if(cb1.isChecked() == false && cb2.isChecked()== false) {
            Toast.makeText(AddItemtoCartActivity.this,"Vui lòng chọn sản phẩm để mua",Toast.LENGTH_SHORT).show();
        }
        if(cb1.isChecked() == true || cb2.isChecked() == true) {

            startActivity(new Intent(AddItemtoCartActivity.this,ThanhtoanAcitvity.class));
        }
        if(cb1.isChecked() == true && cb2.isChecked() == true) {
            startActivity(new Intent(AddItemtoCartActivity.this,ThanhtoanAcitvity.class));

        }


    }
}
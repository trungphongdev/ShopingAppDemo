package com.example.shoppingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    CustomAdapter customAdapter;
    CustomAdapterDetail customAdapterDetail;
    RecyclerView recyclerViewhomeSp;
    RecyclerView recyclerViewhomeDeal;
    RecyclerView recyclerBoloc;
    LinearLayout layout1,layout2,layout3,layout4;
    private  TextView txvSP,txvDeal;
    TextView txvBoloc,txvDohienthi;
    LinearLayout layoutdoihienthi;
    EditText edtSearch;
    ImageView imgbackhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        layout1 = findViewById(R.id.layouthome1);
        layout2 = findViewById(R.id.layouthome2);
        layout3 = findViewById(R.id.layouthome3);
        layout4 = findViewById(R.id.layouthome4);
        txvDeal = findViewById(R.id.txvDealHome);
        txvSP = findViewById(R.id.txvSanphamHome);
        txvBoloc = findViewById(R.id.txvbolochome);
        txvDohienthi = findViewById(R.id.txvdoihienthi);
        edtSearch = findViewById(R.id.edtSearch);
        layoutdoihienthi = findViewById(R.id.layoutdoihienthi);
        // Sp
        ArrayList<ModelItem> itemsSp = getList();
        customAdapter = new CustomAdapter(itemsSp,this);
        recyclerViewhomeSp = findViewById(R.id.recyclerHomeSp);
        recyclerViewhomeSp.setAdapter(customAdapter);
        recyclerViewhomeSp.setLayoutManager(new GridLayoutManager(this,2));

        // Sale
        ArrayList<ModelItemDetail> itemsDeals = getListDeal();
        customAdapterDetail = new CustomAdapterDetail(itemsDeals,this);
        recyclerViewhomeDeal = findViewById(R.id.recyclerHomeDeal);
        recyclerViewhomeDeal.setAdapter(customAdapterDetail);
        recyclerViewhomeDeal.setLayoutManager(new GridLayoutManager(this,2));

        // Bo loc
        recyclerBoloc = findViewById(R.id.recyclerBoloc);
        recyclerBoloc.setAdapter(customAdapterDetail);
        recyclerBoloc.setLayoutManager(new GridLayoutManager(this,2));

        BottomNavigationView navHome = findViewById(R.id.nav_home);
        navHome.setSelectedItemId(R.id.itemHome);
        navHome.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.itemHome: {
                        Toast.makeText(HomeActivity.this,"Bạn đang ở trang Home",Toast.LENGTH_SHORT).show();
                        layout1.setVisibility(View.VISIBLE);
                        layout2.setVisibility(View.GONE);
                        layout3.setVisibility(View.GONE);
                        layout4.setVisibility(View.GONE);
                        edtSearch.setText("Nhập để tìm kiếm");
                        imgbackhome.setVisibility(View.GONE);



                        return true;
                    }
                    case R.id.itemPromote: {
                        startActivity(new Intent(HomeActivity.this,ActivityPromote.class));
                        return true;
                    }
                    case R.id.itemTrend: {
                        startActivity(new Intent(HomeActivity.this,TrendingActivity.class));
                        return true;
                    }
                    case R.id.itemUser: {
                        startActivity(new Intent(HomeActivity.this,AccountAcitvity.class));
                        return true;
                    }
                }
                return false;
            }
        });
        txvSP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txvSP.setBackgroundColor(Color.parseColor("#6B2D5C"));
                txvDeal.setBackgroundColor(Color.parseColor("#B66EA4"));
                recyclerViewhomeSp.setVisibility(View.VISIBLE);
                recyclerViewhomeDeal.setVisibility(View.GONE);
            }
        });
        txvDeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txvDeal.setTextColor(Color.WHITE);
                txvDeal.setBackgroundColor(Color.parseColor("#6B2D5C"));
                txvSP.setBackgroundColor(Color.parseColor("#B66EA4"));
                recyclerViewhomeDeal.setVisibility(View.VISIBLE);
                recyclerViewhomeSp.setVisibility(View.GONE);



            }
        });
getDataFromBoloctimkiem();
getAnhTuthuvien();
        backTimkiem();

    }

    public void giohang(View view) {
        startActivity(new Intent(HomeActivity.this,AddItemtoCartActivity.class));

    }

    public void chatShop(View view) {

        startActivity(new Intent(HomeActivity.this,ChatActivity.class));
    }
    private ArrayList<ModelItem> getList() {
        ArrayList<ModelItem> list = new ArrayList<ModelItem>();
        list.add(new ModelItem("Kem nền Fitme Maybeline M&P","đ169.000","Đã bán 200",R.drawable.maybelin1,R.drawable.fivestar));
        list.add(new ModelItem("Mặt nạ đất sét Innisfree Mask 2X","đ215.000","Đã bán 80",R.drawable.maybeline5,R.drawable.threestar));
        list.add(new ModelItem("Mascara Falsies Lash Lift","đ419.000","Đã bán 20",R.drawable.maybelin3,R.drawable.fourstar));
        list.add(new ModelItem("Phấn nén kiềm dầu 12h Maybeline","đ250.000","Đã bán 400",R.drawable.maybelin4,R.drawable.fourstar));
        list.add(new ModelItem("Phấn Niềm mịn lì Maybeline Fitme","đ490.000","Đã bán 60",R.drawable.maybelin2,R.drawable.fourstar));
        list.add(new ModelItem("Sữa tắm kháng khuẩn Maybeline Extra","đ124.000","Đã bán 99",R.drawable.maybelin6,R.drawable.twostar));
        list.add(new ModelItem("Sữa tắm trẻ em Babyskin Maybeline","đ244.000","Đã bán 459", R.drawable.matna1,R.drawable.fivestar));
        list.add(new ModelItem("Son dưỡng Maybeline siêu thơm","đ600.000","Đã bán 109", R.drawable.son,R.drawable.fivestar));
        list.add(new ModelItem("Sữa tắm kháng khuẩn Maybeline Extra","đ124.000","Đã bán 99",R.drawable.maybelin6,R.drawable.fivestar));
        return list;
    }


    private ArrayList<ModelItemDetail> getListDeal() {
        ArrayList<ModelItemDetail> list = new ArrayList<ModelItemDetail>();
        list.add(new ModelItemDetail("Kem Bio Cream khoáng chất thiên nhiên","Giảm 30k","đ200.000","đ170.000","Đã bán 500", R.drawable.imgbiocream,R.drawable.fivestar));
        list.add(new ModelItemDetail("Sữa rửa mặt Murad vitamin C 200ml","Giảm 75k","đ290.000","đ215.000","Đã bán 80", R.drawable.murad,R.drawable.threestar));
        list.add(new ModelItemDetail("Sữa tắm ngọc trai Vaselin","Giảm 81k","đ500.000","đ 419.000","Đã bán 20", R.drawable.vaselin,R.drawable.fourstar));
        list.add(new ModelItemDetail("Kem trị mụn obagi siêu xịn","Giảm 70k","đ320.000","đ250.000","Đã bán 400", R.drawable.phan,R.drawable.fivestar));
        list.add(new ModelItemDetail("Phấn Niềm mịn lì Maybeline Fitme","Giảm 20k","đ510.000","đ490.000","Đã bán 60",R.drawable.maybelin2,R.drawable.twostar));
        list.add(new ModelItemDetail("Sữa tắm trẻ em Babyskin Maybeline","Giảm 44k","đ288.000","đ244.000","Đã bán 459", R.drawable.matna1,R.drawable.fivestar));
        list.add(new ModelItemDetail("Son dưỡng Maybeline siêu thơm","Giảm 48k","đ680.000","đ600.000","Đã bán 109", R.drawable.son,R.drawable.fivestar));
        list.add(new ModelItemDetail("Sữa tắm kháng khuẩn Maybeline Extra","Giảm 46k","đ170.000","đ124.000","Đã bán 99",R.drawable.maybelin6,R.drawable.fivestar));        list.add(new ModelItemDetail("Sữa tắm trẻ em Babyskin Maybeline","Giảm 44k","đ288.000","đ244.000","Đã bán 459", R.drawable.matna1,R.drawable.fivestar));
        list.add(new ModelItemDetail("Son dưỡng Maybeline siêu thơm","Giảm 48k","đ680.000","đ600.000","Đã bán 109", R.drawable.son,R.drawable.fivestar));
        list.add(new ModelItemDetail("Sữa tắm kháng khuẩn Maybeline Extra","Giảm 46k","đ170.000","đ124.000","Đã bán 99",R.drawable.maybelin6,R.drawable.fivestar));
        return list;
    }


    public void hanlderBrand(View view) {
        edtSearch.setText("Maybeline");
        layout1.setVisibility(View.GONE);
        layout2.setVisibility(View.VISIBLE);
    }

    public void handlerDanhmuc(View view) {
        layout3.setVisibility(View.VISIBLE);
        layout1.setVisibility(View.GONE);
        layout2.setVisibility(View.GONE);
        layout4.setVisibility(View.GONE);
    }

    public void doihienthi(View view) {
        layoutdoihienthi.setBackgroundColor(Color.parseColor("#6B2D5C"));
        txvDohienthi.setTextColor(Color.parseColor("#FFFFFF"));
        txvBoloc.setBackgroundResource(R.drawable.design_square);
        txvBoloc.setTextColor(Color.parseColor("#6B2D5C"));
        recyclerBoloc.setLayoutManager(new LinearLayoutManager(this));
    }

    public void boLoc(View view) {
        txvBoloc.setBackgroundColor(Color.parseColor("#6B2D5C"));
        txvBoloc.setTextColor(Color.parseColor("#FFFFFF"));
        layoutdoihienthi.setBackgroundResource(R.drawable.design_square);
        txvDohienthi.setTextColor(Color.parseColor("#6B2D5C"));
        recyclerBoloc.setLayoutManager(new GridLayoutManager(this,2));
    }

    public void showItems(View view) {
        startActivity(new Intent(HomeActivity.this,ItemDetailActivity.class));
    }


    public void timkiemsp(View view) {

        layout1.setVisibility(View.GONE);
        layout2.setVisibility(View.GONE);
        layout3.setVisibility(View.VISIBLE);
        layout4.setVisibility(View.VISIBLE);
        imgbackhome.setVisibility(View.VISIBLE);

    }
    public void clickdanhmuc(View view) {
        startActivity(new Intent(HomeActivity.this,Boloctimkiem.class));
    }
    public void getDataFromBoloctimkiem() {
      Bundle extras = getIntent().getExtras();
      if(extras != null) {
          edtSearch.setText("Trang điểm - Makeup");
          layout1.setVisibility(View.GONE);
          layout3.setVisibility(View.VISIBLE);
      }
    }
    public void backTimkiem() {
        Bundle extras = getIntent().getExtras();
        if(extras != null && extras.getInt("boloc")==2) {
            edtSearch.setText("Trang điểm - Makeup");
            layout1.setVisibility(View.GONE);
            layout2.setVisibility(View.GONE);
            layout3.setVisibility(View.GONE);
            layout4.setVisibility(View.VISIBLE);
        }
    }
    public void getAnhTuthuvien() {
        Bundle extras = getIntent().getExtras();
        if(extras != null && extras.getInt("DATA") ==1) {
            edtSearch.setText("Trang điểm - Makeup");
            layout1.setVisibility(View.GONE);
            layout3.setVisibility(View.VISIBLE);

        }
    }

    public void moMayAnh(View view) {
        startActivity(new Intent(HomeActivity.this,CameraActivity.class));
    }

    public void showItems1(View view) {
        startActivity(new Intent(HomeActivity.this,ItemDetailActivity1.class));
    }
}
package com.example.shoppingapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    private List<ModelItem> list;
   private Context context;
    public CustomAdapter(List<ModelItem> list, Context context) {
        this.list = list;
        this.context = context;

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_item_row,parent,false);
        return new  ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ModelItem item = list.get(position);
        holder.txvTensp.setText(item.name);
        holder.txvGiasaugiam.setText(item.price);
        holder.txvSoluongban.setText(item.sold);
        holder.imgSp.setImageResource(item.img);
        holder.imgStar.setImageResource(item.imgstar);
        holder.imgSp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,ItemDetailActivity1.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgSp,imgStar;
        TextView txvTensp,txvGiamgia,txvGiabandau,txvGiasaugiam,txvSoluongban;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgSp = itemView.findViewById(R.id.imgSanphamrow);
            txvTensp = itemView.findViewById(R.id.txvTenSprow);
            txvGiamgia = itemView.findViewById(R.id.txvGiamgiarow);
            txvGiabandau = itemView.findViewById(R.id.txvGiabandaurow);
            txvGiasaugiam = itemView.findViewById(R.id.txvGiasaugiamrow);
            txvSoluongban = itemView.findViewById(R.id.txvSoluongbanrow);
            imgStar = itemView.findViewById(R.id.imgStar);


        }
    }
}

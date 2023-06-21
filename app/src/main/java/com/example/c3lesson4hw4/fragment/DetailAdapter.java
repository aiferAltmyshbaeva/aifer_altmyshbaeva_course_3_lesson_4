package com.example.c3lesson4hw4.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.c3lesson4hw4.R;
import com.example.c3lesson4hw4.entity.Country;

import java.util.ArrayList;
import java.util.List;

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.DetailViewHolder> {

    private List<Country> countryList;

    public DetailAdapter(List<Country> countryList) {
        this.countryList = countryList;
    }

    @NonNull
    @Override
    public DetailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DetailViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_detail, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DetailViewHolder holder, int position) {
        holder.bind(countryList.get(position));
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }

    public class DetailViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgFlag;
        private TextView tvCountryName;

        public DetailViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFlag = itemView.findViewById(R.id.img_flag);
            tvCountryName = itemView.findViewById(R.id.tv_country_name);
        }

        public void bind(Country country) {
            Glide.with(imgFlag).load(country.getFlag()).into(imgFlag);
            tvCountryName.setText(country.getName());
        }
    }
}

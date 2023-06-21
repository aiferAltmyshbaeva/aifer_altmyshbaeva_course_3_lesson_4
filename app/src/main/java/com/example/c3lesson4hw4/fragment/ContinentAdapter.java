package com.example.c3lesson4hw4.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.c3lesson4hw4.OnItemClickListener;
import com.example.c3lesson4hw4.R;

import java.util.List;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentAdapter.ContinentViewHolder> {

    private List<String> continentList;
    private OnItemClickListener onItemClickListener;

    public ContinentAdapter(List<String> continentList, OnItemClickListener onItemClickListener) {
        this.continentList = continentList;
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continent, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
    holder.bind(continentList.get(position));
    }

    @Override
    public int getItemCount() {
        return continentList.size();
    }

    public class ContinentViewHolder extends RecyclerView.ViewHolder {

        private TextView tvTitle, tvContinentName;

        public ContinentViewHolder(@NonNull View itemView) {
            super(itemView);
            tvContinentName = itemView.findViewById(R.id.tv_continent_name);
        }


        public void bind(String continent) {
            tvContinentName.setText(continent);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClickListener.onItemClick(getAdapterPosition());
                }
            });
        }
    }
}

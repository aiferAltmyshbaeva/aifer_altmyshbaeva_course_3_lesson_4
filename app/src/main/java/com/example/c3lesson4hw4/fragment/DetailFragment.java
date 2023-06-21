package com.example.c3lesson4hw4.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.c3lesson4hw4.databinding.FragmentDetailBinding;
import com.example.c3lesson4hw4.entity.Country;
import com.example.c3lesson4hw4.service.ContinentService;

import java.util.ArrayList;
import java.util.List;


public class DetailFragment extends Fragment {

    private FragmentDetailBinding binding;
    private DetailAdapter adapter;
    private List<Country> countryList = new ArrayList<>();
    private final ContinentService service = new ContinentService();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetailBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String continent = (String) getArguments().getSerializable("continent");
        loadData(continent);
        adapter = new DetailAdapter(countryList);
        binding.rvDetail.setAdapter(adapter);


    }

    private void loadData(String continent) {
        countryList = service.getCountryByContinent(continent);
    }
}
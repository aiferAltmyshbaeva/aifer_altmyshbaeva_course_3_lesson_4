package com.example.c3lesson4hw4.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.c3lesson4hw4.OnItemClickListener;
import com.example.c3lesson4hw4.R;
import com.example.c3lesson4hw4.databinding.FragmentContinentBinding;
import com.example.c3lesson4hw4.service.ContinentService;

import java.util.List;

public class ContinentFragment extends Fragment implements OnItemClickListener {

    private FragmentContinentBinding binding;
    private ContinentAdapter adapter;
    private List<String> continentList;
    private ContinentService service = new ContinentService();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new ContinentAdapter(continentList, this);
        binding.rvContinent.setAdapter(adapter);
    }

    private void loadData() {
        continentList = service.getContinent();
    }

    public void onItemClick(int position){
        String continent = continentList.get(position);
        Bundle bundle = new Bundle();
        bundle.putSerializable("continent", continent);
        DetailFragment fragment = new DetailFragment();
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, fragment).addToBackStack(null).commit();
    }
}
package com.example.c3lesson4hw4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.c3lesson4hw4.databinding.ActivityMainBinding;
import com.example.c3lesson4hw4.fragment.ContinentFragment;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportFragmentManager().beginTransaction().add(R.id.container, new ContinentFragment()).addToBackStack(null).commit();
    }
}
package com.example.c3lesson4hw4.service;

import com.example.c3lesson4hw4.repository.ContinentInMemoryRepository;
import com.example.c3lesson4hw4.entity.Country;

import java.util.ArrayList;
import java.util.List;

public class ContinentService {

    private final ContinentInMemoryRepository repository = new ContinentInMemoryRepository();

    public List<String> getContinent() {
        List<String> continents = new ArrayList<>(repository.getContinent());
        return continents;
    }

    public List<Country> getCountryByContinent(String continent) {
        return repository.getCountriesByContinent(continent);
    }
}

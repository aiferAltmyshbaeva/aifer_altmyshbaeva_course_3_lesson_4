package com.example.c3lesson4hw4.repository;

import com.example.c3lesson4hw4.entity.Country;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ContinentInMemoryRepository {

    private static final  Map<String, List<Country>> continents = new HashMap<>();

    static {
        List<Country> auCountries = new ArrayList<>();
        auCountries.add(new Country("Australia", "https://www.sciencekids.co.nz/images/pictures/flags680/Australia.jpg"));
        continents.put("Australia", auCountries);

        List<Country> anCountries = new ArrayList<>();
        anCountries.add(new Country("Antarctica", ""));
        continents.put("Antarctica", anCountries);

        List<Country> euCountries = new ArrayList<>();
        euCountries.add(new Country("Kyrgyzstan", "https://www.sciencekids.co.nz/images/pictures/flags680/Kyrgyzstan.jpg"));
        euCountries.add(new Country("Poland", "https://www.sciencekids.co.nz/images/pictures/flags680/Poland.jpg"));
        euCountries.add(new Country("Germany", "https://www.sciencekids.co.nz/images/pictures/flags680/Germany.jpg"));
        euCountries.add(new Country("Belarus", "https://www.sciencekids.co.nz/images/pictures/flags680/Belarus.jpg"));
        euCountries.add(new Country("Netherlands", "https://www.sciencekids.co.nz/images/pictures/flags680/Netherlands.jpg"));
        continents.put("Eurasia", euCountries);

        List<Country> afCountries = new ArrayList<>();
        afCountries.add(new Country("Nigeria", "https://www.sciencekids.co.nz/images/pictures/flags680/Nigeria.jpg"));
        afCountries.add(new Country("Egypt", "https://www.sciencekids.co.nz/images/pictures/flags680/Egypt.jpg"));
        afCountries.add(new Country("Algeria", "https://www.sciencekids.co.nz/images/pictures/flags680/Algeria.jpg"));
        afCountries.add(new Country("Ethiopia", "https://www.sciencekids.co.nz/images/pictures/flags680/Ethiopia.jpg"));
        afCountries.add(new Country("Morocco", "https://www.sciencekids.co.nz/images/pictures/flags680/Morocco.jpg"));
        continents.put("Africa", afCountries);

        List<Country> naCountries = new ArrayList<>();
        naCountries.add(new Country("Canada", "https://www.sciencekids.co.nz/images/pictures/flags680/Canada.jpg"));
        naCountries.add(new Country("Costa Rica", "https://www.sciencekids.co.nz/images/pictures/flags680/Costa_Rica.jpg"));
        naCountries.add(new Country("Cuba", "https://www.sciencekids.co.nz/images/pictures/flags680/Cuba.jpg"));
        naCountries.add(new Country("Mexico", "https://www.sciencekids.co.nz/images/pictures/flags680/Mexico.jpg"));
        naCountries.add(new Country("United States", "https://www.sciencekids.co.nz/images/pictures/flags680/United_States.jpg"));
        continents.put("North America", naCountries);

        List<Country> saCountries = new ArrayList<>();
        saCountries.add(new Country("Argentina", "https://www.sciencekids.co.nz/images/pictures/flags680/Argentina.jpg"));
        saCountries.add(new Country("Brazil", "https://www.sciencekids.co.nz/images/pictures/flags680/Brazil.jpg"));
        saCountries.add(new Country("Ecuador", "https://www.sciencekids.co.nz/images/pictures/flags680/Ecuador.jpg"));
        saCountries.add(new Country("Peru", "https://www.sciencekids.co.nz/images/pictures/flags680/Peru.jpg"));
        saCountries.add(new Country("Uruguay", "https://www.sciencekids.co.nz/images/pictures/flags680/Uruguay.jpg"));
        continents.put("South America", saCountries);
    }

    public Set<String> getContinent() {
        return continents.keySet();
    }

    public List<Country> getCountriesByContinent(String continent) {
        return continents.get(continent);
    }
}

package com.example.presidentcountryi.controller;

import com.example.presidentcountryi.model.Country;
import com.example.presidentcountryi.model.President;
import com.example.presidentcountryi.repository.CountryRepository;
import com.example.presidentcountryi.repository.PresidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PresidentRestController {

    @Autowired
    PresidentRepository presidentRepository;

    @Autowired
    CountryRepository countryRepository;

    @GetMapping("/countries")
    public List<Country> getCountries() {
        return countryRepository.findAll();
    }

    @GetMapping("/presidents")
    public List<President> getPresidents() {
        return presidentRepository.findAll();
    }
}

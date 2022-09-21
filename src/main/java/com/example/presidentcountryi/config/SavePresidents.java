package com.example.presidentcountryi.config;

import com.example.presidentcountryi.model.Country;
import com.example.presidentcountryi.model.President;
import com.example.presidentcountryi.repository.CountryRepository;
import com.example.presidentcountryi.repository.PresidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SavePresidents implements CommandLineRunner {

    @Autowired
    PresidentRepository presidentRepository;

    @Autowired
    CountryRepository countryRepository;

    @Override
    public void run(String... args) throws Exception {
        Country dk = new Country("DK", "Denmark");
        countryRepository.save(dk);

        Country us = new Country("US", "United States");
        countryRepository.save(us);

        President p = new President();
        p.setCountry(dk);
        p.setFirstName("Mettex");
        p.setLastName("Frederiksen");
        presidentRepository.save(p);



  }
}

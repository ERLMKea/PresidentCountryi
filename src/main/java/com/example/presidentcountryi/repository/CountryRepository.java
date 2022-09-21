package com.example.presidentcountryi.repository;

import com.example.presidentcountryi.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, String> {
}

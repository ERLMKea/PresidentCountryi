package com.example.presidentcountryi.repository;

import com.example.presidentcountryi.model.President;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PresidentRepository extends JpaRepository<President, Integer> {
}

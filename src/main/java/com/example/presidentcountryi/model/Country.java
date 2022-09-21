package com.example.presidentcountryi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Country {

    @Id
    @Column(length = 2, name = "countrycode")
    private String countryCode;

    private String countryName;

    @OneToMany
    @JoinColumn(name = "countrycode")
    @JsonBackReference
    private Set<President> presidents = new HashSet<>();

    public Set<President> getPresidents() {
        return presidents;
    }

    public void setPresidents(Set<President> presidents) {
        this.presidents = presidents;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}

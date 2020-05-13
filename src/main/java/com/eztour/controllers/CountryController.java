package com.eztour.controllers;

import com.eztour.entity.CountryEntity;
import com.eztour.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(value = "/country")
public class CountryController {
    @Autowired
    CountryService countryService;

    @GetMapping(value = "/show")
    public List<CountryEntity> getAll() {
        return countryService.getAll();
    }
}
package com.eztour.controllers;

import com.eztour.dto.CountryDTO;
import com.eztour.entity.CountryEntity;
import com.eztour.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @PostMapping(value = "/add")
    public void add(@Valid @RequestBody CountryDTO dto){
        countryService.add(dto);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable(value = "id") int id){
        countryService.delete(id);
    }
}
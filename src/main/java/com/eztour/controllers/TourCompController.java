package com.eztour.controllers;

import com.eztour.entity.TourCompanyEntity;
import com.eztour.service.TourCompService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(value = "/tourComp")
public class TourCompController {

    @Autowired
    TourCompService tourCompService;

    @GetMapping(value = "/show")
    public List<TourCompanyEntity> getAll() {
        return tourCompService.getAll();
    }

    @GetMapping(value = "/showSingle/{id}")
    public List<TourCompanyEntity> getSingle(@PathVariable(value = "id") int id) {
        return tourCompService.getSingle(id);
    }
}

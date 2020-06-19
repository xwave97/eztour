package com.eztour.controllers;

import com.eztour.dto.StartCityDTO;
import com.eztour.dto.TourTypeDTO;
import com.eztour.entity.StartCityEntity;
import com.eztour.entity.TourTypeEntity;
import com.eztour.service.StartCityService;
import com.eztour.service.TourTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(value = "/startcity")
public class StartCityController {

    @Autowired
    StartCityService startCityService;

    @GetMapping(value = "/show")
    public List<StartCityEntity> getAll() {
        return startCityService.getAll();
    }

    @PostMapping(value = "/add")
    public void add(@Valid @RequestBody StartCityDTO dto){
        startCityService.add(dto);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable(value = "id") int id){
        startCityService.delete(id);
    }
}

package com.eztour.controllers;

import com.eztour.dto.TourTypeDTO;
import com.eztour.entity.TourEntity;
import com.eztour.entity.TourTypeEntity;
import com.eztour.service.TourService;
import com.eztour.service.TourTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(value = "/tourtype")
public class TourTypeContoller {

    @Autowired
    TourTypeService tourTypeService;

    @GetMapping(value = "/show")
    public List<TourTypeEntity> getAll() {
        return tourTypeService.getAll();
    }

    @PostMapping(value = "/add")
    public void add(@Valid @RequestBody TourTypeDTO dto){
        tourTypeService.add(dto);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable(value = "id") int id){
        tourTypeService.delete(id);
    }
}

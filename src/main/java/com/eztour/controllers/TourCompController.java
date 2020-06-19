package com.eztour.controllers;

import com.eztour.dto.TourCompDTO;
import com.eztour.entity.TourCompanyEntity;
import com.eztour.service.TourCompService;
import org.hibernate.ResourceClosedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(value = "/tourComp")
public class TourCompController {

    @Autowired
    TourCompService tourCompService;

    @GetMapping(value = "/show/{str}")
    public List<TourCompanyEntity> getAll(@PathVariable(value = "str") String str) {
        return tourCompService.getAll(str);
    }

    @PostMapping(value = "/add")
    public void add(@RequestBody TourCompDTO dto){
        tourCompService.add(dto);
    }

    @GetMapping(value = "/showSingle/{id}")
    public TourCompanyEntity getSingle(@PathVariable(value = "id") int id) {
        return tourCompService.getSingle(id);
    }

    @PutMapping(value = "/setLike/{id}")
    public void setLike(@PathVariable(value = "id") int id,
                        @Valid @RequestBody int inc) throws InterruptedException {
        tourCompService.pressLike(id, inc);
    }

    @PutMapping(value = "/setDislike/{id}")
    public void setDislike(@PathVariable(value = "id") int id,
                        @Valid @RequestBody int dec) throws InterruptedException {
        tourCompService.pressDislike(id, dec);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable(value = "id") int id){
        tourCompService.delete(id);
    }
}

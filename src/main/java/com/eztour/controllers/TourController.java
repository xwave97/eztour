package com.eztour.controllers;

import com.eztour.dto.FilterDTO;
import com.eztour.dto.TourDTO;
import com.eztour.entity.TourCompanyEntity;
import com.eztour.entity.TourEntity;
import com.eztour.filters.ToursFilter;
import com.eztour.service.TourCompService;
import com.eztour.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(value = "/tour")
public class TourController {


    @Autowired
    TourService tourService;
    @Autowired
    ToursFilter toursFilter;

    @GetMapping(value = "/show")
    public List<TourEntity> getAll() {
        return tourService.getAll();
    }

    @PostMapping(value = "/add")
    public void add(@RequestBody TourDTO dto){
        tourService.add(dto);
    }

    @GetMapping(value = "/show/{tourTypeId}/{cityStartId}/{countryId}/{price}/{during}/{date}")
    public List<TourEntity> getByFilters(@PathVariable(value = "tourTypeId")String  tourTypeId,
                                         @PathVariable(value = "cityStartId") String cityStartId,
                                         @PathVariable(value = "countryId") String countryId,
                                         @PathVariable(value = "price") String price,
                                         @PathVariable(value = "during") String during,
                                         @PathVariable(value = "date") String date)
    {
        List<TourEntity> list = tourService.getAll();
        if(!cityStartId.equals("undefined"))
            list = toursFilter.getByStartCity(Integer.parseInt(cityStartId), list);
        if(!countryId.equals("undefined"))
            list = toursFilter.getByCountry(Integer.parseInt(countryId),  list);
        if(!during.equals("undefined"))
            list = toursFilter.getByDuring(Integer.parseInt(during),  list);
        if(!tourTypeId.equals("undefined"))
            list = toursFilter.getByTourType(Integer.parseInt(tourTypeId),  list);
        if(!price.equals("undefined"))
            list = toursFilter.getByPrice(Integer.parseInt(price),  list);
        if(!during.equals("undefined"))
            list = toursFilter.getByDuring(Integer.parseInt(during),  list);
        if(!date.equals("undefined"))
            list = toursFilter.getByDate(date, list);
        return  list;
    }


    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable(value = "id") int id){
        tourService.delete(id);
    }
}

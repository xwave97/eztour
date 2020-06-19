package com.eztour.filters;

import com.eztour.entity.TourEntity;
import com.eztour.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ToursFilter {

    @Autowired
    TourService tourService;

    @Transactional
    public List<TourEntity> getByStartCity(int startCityId, List<TourEntity> tourEntities){
        List<TourEntity> list = new ArrayList<>();
        for(TourEntity tourEntity : tourEntities){
            if(tourEntity.getStartCity().getStartCityId() == startCityId)
            list.add(tourEntity);
        }
        return list;
    }
    @Transactional
    public List<TourEntity> getByTourType(int tourTypeId, List<TourEntity> tourEntities){
        List<TourEntity> list = new ArrayList<>();
        for(TourEntity tourEntity : tourEntities){
            if(tourEntity.getTourType().getTourTypeId() == tourTypeId)
                list.add(tourEntity);
        }
        return list;
    }

    @Transactional
    public List<TourEntity> getByCountry(int countryId, List<TourEntity> tourEntities){
        List<TourEntity> list = new ArrayList<>();
        for(TourEntity tourEntity : tourEntities){
            if(tourEntity.getCountry().getCountryId() == countryId)
                list.add(tourEntity);
        }
        return list;
    }

    @Transactional
    public List<TourEntity> getByPrice(int price, List<TourEntity> tourEntities){
        List<TourEntity> list = new ArrayList<>();
        for(TourEntity tourEntity : tourEntities){
            if(tourEntity.getTourPrice() < price)
                list.add(tourEntity);
        }
        return list;
    }

    @Transactional
    public List<TourEntity> getByDuring(int during, List<TourEntity> tourEntities){
        List<TourEntity> list = new ArrayList<> ();
        for(TourEntity tourEntity : tourEntities){
            if(tourEntity.getTourDuring() == during)
                list.add(tourEntity);
        }
        return list;
    }

    @Transactional
    public List<TourEntity> getByDate(String date, List<TourEntity> tourEntities){
        List<TourEntity> list = new ArrayList<>();
        for(TourEntity tourEntity : tourEntities){
            if(tourEntity.getTourStart().equals(date))
                list.add(tourEntity);
        }
        return list;
    }


}

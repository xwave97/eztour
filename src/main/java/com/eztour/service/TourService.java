package com.eztour.service;

import com.eztour.dto.TourDTO;
import com.eztour.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TourService {

    @Autowired
    private SessionFactory sessionFactory;

    public Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Transactional
    public List<TourEntity> getAll(){
        List<TourEntity> list = getSession().createQuery("from TourEntity").list();
        return list;
    }

    @Transactional
    public void delete(int id){
        TourEntity entity = getSession().find(TourEntity.class, id);
        getSession().delete(entity);
    }

    @Transactional
    public void add(TourDTO dto){
        TourEntity entity = new TourEntity();
        CountryEntity countryEntity = getSession().find(CountryEntity.class, dto.getCountry());
        TourCompanyEntity tourCompanyEntity = getSession().find(TourCompanyEntity.class, dto.getTourCompany());
        TourTypeEntity tourTypeEntity = getSession().find(TourTypeEntity.class, dto.getTourType());
        StartCityEntity startCityEntity = getSession().find(StartCityEntity.class, dto.getStartCity());
        entity.setTourName(dto.getTourName());
        entity.setTourDecription(dto.getTourDecription());
        entity.setTourPrice(dto.getTourPrice());
        entity.setTourPhoto(dto.getTourPhoto());
        entity.setTourDuring(dto.getTourDuring());
        entity.setTourStart(dto.getTourStart());
        entity.setTourEnd(dto.getTourEnd());
        entity.setCountry(countryEntity);
        entity.setTourCompany(tourCompanyEntity);
        entity.setTourType(tourTypeEntity);
        entity.setStartCity(startCityEntity);
        getSession().save(entity);
    }
}

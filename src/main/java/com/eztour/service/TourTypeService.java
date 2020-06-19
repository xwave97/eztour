package com.eztour.service;

import com.eztour.dto.TourTypeDTO;
import com.eztour.entity.CountryEntity;
import com.eztour.entity.TourEntity;
import com.eztour.entity.TourTypeEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TourTypeService {
    @Autowired
    private SessionFactory sessionFactory;

    public Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Transactional
    public List<TourTypeEntity> getAll(){
        List<TourTypeEntity> list = getSession().createQuery("from TourTypeEntity").list();
        return list;
    }

    @Transactional
    public void add(TourTypeDTO dto){
        TourTypeEntity entity = new TourTypeEntity();
        entity.setTourTypeName(dto.getTourTypeName());
        getSession().save(entity);
    }

    @Transactional
    public void delete(int id){
        TourTypeEntity entity = getSession().find(TourTypeEntity.class, id);
        getSession().delete(entity);
    }
}

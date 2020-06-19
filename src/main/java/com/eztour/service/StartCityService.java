package com.eztour.service;

import com.eztour.dto.StartCityDTO;
import com.eztour.entity.StartCityEntity;
import com.eztour.entity.TourTypeEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StartCityService {

    @Autowired
    private SessionFactory sessionFactory;

    public Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Transactional
    public List<StartCityEntity> getAll(){
        List<StartCityEntity> list = getSession().createQuery("from StartCityEntity").list();
        return list;
    }

    @Transactional
    public void add(StartCityDTO dto){
        StartCityEntity entity = new StartCityEntity();
        entity.setStartCityName(dto.getStartCityName());
        getSession().save(entity);
    }

    @Transactional
    public void delete(int id){
        StartCityEntity entity = getSession().find(StartCityEntity.class, id);
        getSession().delete(entity);
    }
}

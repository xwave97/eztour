package com.eztour.service;

import com.eztour.entity.CountryEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private SessionFactory sessionFactory;

    public Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }
    @Transactional
    public List<CountryEntity> getAll(){
        List<CountryEntity> list = getSession().createQuery("from CountryEntity ").list();
        return list;
    }
}

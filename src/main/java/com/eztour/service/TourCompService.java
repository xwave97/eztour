package com.eztour.service;

import com.eztour.entity.TourCompanyEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TourCompService {

    @Autowired
    SessionFactory sessionFactory;

    public Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Transactional
    public List<TourCompanyEntity> getAll(){
        List<TourCompanyEntity> list = getSession().createQuery("from TourCompanyEntity order by tourCompRate desc ").list();
        return list;
    }
}

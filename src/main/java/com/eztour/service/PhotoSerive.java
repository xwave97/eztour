package com.eztour.service;

import com.eztour.entity.PhotosEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class PhotoSerive {
    @Autowired
    private SessionFactory sessionFactory;

    public Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }
    @Transactional
    public void add(PhotosEntity entity){
        getSession().save(entity);
    }

}

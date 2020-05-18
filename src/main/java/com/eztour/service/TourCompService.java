package com.eztour.service;

import com.eztour.entity.TourCompanyEntity;
import com.eztour.entity.UsersEntity;
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
    public List<TourCompanyEntity> getAll() {
        List<TourCompanyEntity> list = getSession().createQuery("from TourCompanyEntity order by tourCompDislikes desc ").list();
        return list;
    }

    @Transactional
    public TourCompanyEntity getSingle(int id) {
        TourCompanyEntity entity = getSession().find(TourCompanyEntity.class, id);
        return entity;
    }

    @Transactional
    public void pressLike(int id, int inc) throws InterruptedException {
        TourCompanyEntity entity = getSession().find(TourCompanyEntity.class, id);
        entity.setTourCompLikes(entity.getTourCompLikes() + inc);
        getSession().update(entity);
    }

    @Transactional
    public void pressDislike(int id, int dec) throws InterruptedException {
        TourCompanyEntity entity = getSession().find(TourCompanyEntity.class, id);
        entity.setTourCompLikes(entity.getTourCompLikes() - dec);
        getSession().update(entity);
    }
}

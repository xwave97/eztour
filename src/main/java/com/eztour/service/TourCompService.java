package com.eztour.service;

import com.eztour.dto.TourCompDTO;
import com.eztour.dto.TourTypeDTO;
import com.eztour.entity.ArticlesEntity;
import com.eztour.entity.TourCompanyEntity;
import com.eztour.entity.TourTypeEntity;
import com.eztour.entity.UsersEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TourCompService {

    @Autowired
    private SessionFactory sessionFactory;

    public Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Transactional
    public List<TourCompanyEntity> getAll(String filter) {
        if (!filter.equals("undefined") && filter != null) {
            Query query = getSession().createQuery("from TourCompanyEntity where tourCompName like :filter order by tourCompDislikes desc ");
            query.setParameter("filter", "%" + filter + "%");
            List<TourCompanyEntity> list = query.list();
            return list;
        }
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

    @Transactional
    public void delete(int id){
        TourCompanyEntity entity = getSession().find(TourCompanyEntity.class, id);
        getSession().delete(entity);
    }

    @Transactional
    public void add(TourCompDTO dto){
        TourCompanyEntity entity = new TourCompanyEntity();
        entity.setTourCompName(dto.getTourCompName());
        entity.setTourCompAdress(dto.getTourCompAdress());
        entity.setTourCompUrl(dto.getTourCompUrl());
        entity.setTourCompPhoto(dto.getTourCompPhoto());
        entity.setTourCompDecription(dto.getTourCompDecription());
        entity.setTourCompLikes(0);
        entity.setTourCompDislikes(0);
        getSession().save(entity);
    }
}

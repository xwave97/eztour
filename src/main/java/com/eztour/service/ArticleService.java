package com.eztour.service;

import com.eztour.entity.ArticlesEntity;
import com.eztour.entity.CountryEntity;
import com.eztour.entity.TourCompanyEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {
    @Autowired
    SessionFactory sessionFactory;

    public Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }
    @Transactional
    public List<ArticlesEntity> getAll(){
        List<ArticlesEntity> list = getSession().createQuery("from ArticlesEntity order by articleId desc").list();
        return list;
    }

    @Transactional
    public List<ArticlesEntity> getForMainPage(){
        int c = 0;
        List<ArticlesEntity> fourList = new ArrayList<>();
        List<ArticlesEntity> list = getSession().createQuery("from ArticlesEntity order by articleId desc ").list();
        for(ArticlesEntity entity: list){
            c++;
            if(c <= 4){
            fourList.add(entity);
            }
        }
        return fourList;
    }

    @Transactional
    public ArticlesEntity getSingle(int id) {
        ArticlesEntity entity = getSession().find(ArticlesEntity.class, id);
        return entity;
    }

    @Transactional
    public void add(ArticlesEntity entity){
        getSession().save(entity);
    }

    @Transactional
    public void delete(int id){
        ArticlesEntity entity = getSession().find(ArticlesEntity.class, id);
        getSession().delete(entity);
    }
}

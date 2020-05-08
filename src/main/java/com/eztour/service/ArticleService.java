package com.eztour.service;

import com.eztour.entity.ArticlesEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    private SessionFactory sessionFactory;

    public Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }
    @Transactional
    public List<ArticlesEntity> getAll(){
        List<ArticlesEntity> list = getSession().createQuery("from ArticlesEntity ").list();

        return list;
    }

}

package com.eztour.service;


import com.eztour.entity.UsersEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private SessionFactory sessionFactory;

    public Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Transactional
    public List<UsersEntity> getAll() {
        List<UsersEntity> list = getSession().createQuery("from UsersEntity ").list();
        return list;
    }

    @Transactional
    public void add(UsersEntity entity) {
        getSession().save(entity);
    }


}

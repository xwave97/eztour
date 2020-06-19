package com.eztour.service;

import com.eztour.dto.CommentDTO;
import com.eztour.entity.ArticlesEntity;
import com.eztour.entity.CommentsEntity;
import com.eztour.entity.TourCompanyEntity;
import com.eztour.entity.UsersEntity;
import org.apache.tomcat.jni.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CommentsService {


    int idUser;

    @Autowired
    SessionFactory sessionFactory;

    public Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Transactional
    public List<CommentsEntity> getAll(int id){
        List<CommentsEntity> list = getSession().createQuery("from CommentsEntity where tourCompanyId = "+id+" order by commentId desc ").list();
        return list;
    }

    @Transactional
    public void add(CommentDTO dto){
        CommentsEntity commentsEntity = new CommentsEntity();
        List<UsersEntity> list = getSession().createQuery("from UsersEntity ").list();
        for(UsersEntity entity: list){
            if(entity.getUserName().equals(dto.getUserLogin())){
                this.idUser = entity.getUserId();
            }
        }
   UsersEntity usersEntity = getSession().find(UsersEntity.class, this.idUser);
        TourCompanyEntity tourCompanyEntity = getSession().find(TourCompanyEntity.class, dto.getTourCompId());
        commentsEntity.setCommentText(dto.getCommentText());
        commentsEntity.setTourCompanyId(tourCompanyEntity);
        commentsEntity.setUserId(usersEntity);
        getSession().save(commentsEntity);
    }}

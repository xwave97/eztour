package com.eztour.service;

import com.eztour.entity.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ValidationService {

    @Autowired
    UserService userService;

    @Transactional
    public boolean checkLogin(UsersEntity user) {
        for (UsersEntity entity : userService.getAll()) {
            if (entity.getUserName().equals(user.getUserName())) {
                return false;
            }
        }
        return true;
    }

    @Transactional
    public boolean checkEmail(UsersEntity user) {
        for (UsersEntity entity : userService.getAll()) {
            if (entity.getUserEmail().equals(user.getUserEmail())) {
                return false;
            }
        }
        return true;
    }

    @Transactional
    public boolean checkAuth(String login, String password){
        for (UsersEntity entity: userService.getAll()){
            if(entity.getUserName().equals(login)){
                if (entity.getUserPassword().equals(password)){
                    return true;
                }
            }
        }
        return false;
    }
}

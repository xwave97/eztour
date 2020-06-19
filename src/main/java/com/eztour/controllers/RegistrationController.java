package com.eztour.controllers;

import com.eztour.dto.AuthDTO;
import com.eztour.entity.UsersEntity;
import com.eztour.service.UserService;
import com.eztour.service.ValidationService;
import org.hibernate.mapping.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.management.relation.Role;
import javax.validation.Valid;
import java.util.Collections;
import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(value = "/registration")
public class RegistrationController {

    @Autowired
    UserService userService;

    @Autowired
    ValidationService validationService;

    @GetMapping(value = "/show")
    public List<UsersEntity> show(){
        return userService.getAll();
    }

    @PostMapping(value = "/add")
    public int addUser(@RequestBody UsersEntity user) {
        if (!validationService.checkLogin(user))
            return 1;
        if (!validationService.checkEmail(user))
            return 2;
        userService.add(user);
        return 0;
    }

    @PostMapping(value = "/auth")
    public UsersEntity authUser(@RequestBody AuthDTO authDTO){
        if(!validationService.checkAuth(authDTO.getLogin(),authDTO.getPassword()))
            return null;
        return userService.auth(authDTO.getLogin());
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable(value = "id") int id){
        userService.delete(id);
    }
}

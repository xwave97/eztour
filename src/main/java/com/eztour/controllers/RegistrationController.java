package com.eztour.controllers;

import com.eztour.entity.UsersEntity;
import com.eztour.service.UserService;
import com.eztour.service.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(value = "/registration")
public class RegistrationController {

    @Autowired
    UserService userService;

    @Autowired
    ValidationService validationService;

    @PostMapping(value = "/add")
    public int addUser(@RequestBody UsersEntity user) {
        if (!validationService.checkLogin(user))
            return 1;
        if (!validationService.checkEmail(user))
            return 2;
        userService.add(user);
        return 0;
    }
}

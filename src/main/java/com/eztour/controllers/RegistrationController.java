package com.eztour.controllers;

import com.eztour.entity.UsersEntity;
import com.eztour.service.RegService;
import com.eztour.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@CrossOrigin("http://localhost:4200")
@Controller
@RequestMapping(value = "/registration")
public class RegistrationController {

    @Autowired
    RegService regService;
    @Autowired
    UserService userService;


    @RequestMapping(value = "/add")
    public String addUser(Model model, @RequestParam String login, String email, String password){
        model.addAttribute("isValidLogin", true);
        for(UsersEntity user : userService.getAll()){
            if(user.getUserName().equals(login)) {
                model.addAttribute("isValidLogin", false);
                return "registration";
            }
        }
        UsersEntity user = new UsersEntity();
        user.setUserName(login);
        user.setUserEmail(email);
        user.setUserPassword(password);
        regService.add(user);
        return "index";
    }
}

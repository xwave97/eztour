package com.eztour.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping(value = "/direct")
public class DirectController {
    @RequestMapping("/about")
    public String about(){return "about";}

    @RequestMapping("/registration")
    public String registration(){return "registration";}

    @RequestMapping("/uploadPage")
    public String uploadPage(){return "upload";}
}

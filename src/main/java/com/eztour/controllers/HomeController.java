package com.eztour.controllers;

import com.eztour.entity.PhotosEntity;
import com.eztour.service.ArticleService;
import com.eztour.service.CountryService;
import com.eztour.service.TourCompService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @Autowired
    CountryService countryService;
    @Autowired
    ArticleService articleService;
    @Autowired
    TourCompService tourCompService;

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("list", countryService.getAll());
        model.addAttribute("articleList", articleService.getAll());
        model.addAttribute("tourCompList", tourCompService.getAll());
//        articleService.getAll();
        return "index";
    }

    @RequestMapping("/addPic")
    public String addPic(@RequestParam String photo){
        PhotosEntity entity = new PhotosEntity();
        entity.setPhotoId(1);
        entity.setPhoto(photo);
        return "index";
    }


}

package com.eztour.controllers;

import com.eztour.entity.ArticlesEntity;
import com.eztour.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(value = "/article")
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @GetMapping(value = "/show")
    public List<ArticlesEntity> getAll() {
        return articleService.getAll();
    }
}

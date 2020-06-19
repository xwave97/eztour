package com.eztour.controllers;

import com.eztour.entity.ArticlesEntity;
import com.eztour.entity.TourCompanyEntity;
import com.eztour.service.ArticleService;
import com.eztour.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(value = "/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    StorageService storageService;

    @GetMapping(value = "/show")
    public List<ArticlesEntity> getAll() {
        return articleService.getAll();
    }

    @GetMapping(value = "/showfour")
    public List<ArticlesEntity> getFour() {
        return articleService.getForMainPage();
    }

    @GetMapping(value = "/showSingle/{id}")
    public ArticlesEntity getSingle(@PathVariable(value = "id") int id) {
        return articleService.getSingle(id);
    }

    @PostMapping(value = "/add")
    public void add(@Valid @RequestBody ArticlesEntity articlesEntity){
        articlesEntity.getArticlePhoto();
        articleService.add(articlesEntity);
    }

    @PostMapping("/post")
    public void handleFileUpload(@RequestParam("file") MultipartFile file) throws Exception{
        storageService.store(file);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable(value = "id") int id){
        articleService.delete(id);
    }

}

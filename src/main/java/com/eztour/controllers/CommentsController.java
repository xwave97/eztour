package com.eztour.controllers;

import com.eztour.dto.CommentDTO;
import com.eztour.entity.ArticlesEntity;
import com.eztour.entity.CommentsEntity;
import com.eztour.service.CommentsService;
import com.eztour.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(value = "/comments")
public class CommentsController {

    @Autowired
    private CommentsService commentsService;


    @GetMapping(value = "/show/{id}")
    public List<CommentsEntity> getAll(@PathVariable(value = "id") int id) {
        return commentsService.getAll(id);
    }

    @PostMapping(value = "/add")
    public void add(@Valid @RequestBody CommentDTO dto){
        commentsService.add(dto);
    }
}

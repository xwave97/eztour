package com.eztour.controllers;

import com.eztour.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;


@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(value = "/upload")
public class UploadController {

        @Autowired
        StorageService storageService;

    List<String> files = new ArrayList<String>();

    @PostMapping("/post")
    public void handleFileUpload(@RequestParam("file") MultipartFile file) throws Exception{
        String message = "";
            storageService.store(file);
            files.add(file.getOriginalFilename());

    }

}

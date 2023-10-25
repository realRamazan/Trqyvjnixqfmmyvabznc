package com.example.Trqyvjnixqfmmyvabznc.controller;

import com.example.Trqyvjnixqfmmyvabznc.model.UserMongoDB;
import com.example.Trqyvjnixqfmmyvabznc.repository.UserMongoDBRepository;
import com.example.Trqyvjnixqfmmyvabznc.service.UserMongoDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserMongoDBController {

    @Autowired
    UserMongoDBService userMongoDBService;

    @GetMapping("/mongoDB")
    public List<UserMongoDB> getAll(){
        return userMongoDBService.findAll();
    }
}

package com.example.Trqyvjnixqfmmyvabznc.controller;

import com.example.Trqyvjnixqfmmyvabznc.dto.UserDTO;
import com.example.Trqyvjnixqfmmyvabznc.dto.UserMongoDTO;
import com.example.Trqyvjnixqfmmyvabznc.model.UserMongoDB;
import com.example.Trqyvjnixqfmmyvabznc.packageFilter.Filter;
import com.example.Trqyvjnixqfmmyvabznc.repository.UserMongoDBRepository;
import com.example.Trqyvjnixqfmmyvabznc.service.UserMongoDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserMongoDBController {

    @Autowired
    UserMongoDBService userMongoDBService;

    @GetMapping("/userMongo")
    public UserMongoDB getUserMongoDB(@RequestParam("id") String id){
        return userMongoDBService.getUserMongoDB(id);
    }
    @GetMapping("/mongoDB")
    public List<UserMongoDB> getAll(@RequestBody Filter filter){
        return userMongoDBService.findAll(filter);
    }
    @PostMapping("/createMongo")
    public List<UserMongoDB> createUserMongoDB(@RequestBody UserMongoDTO userMongoDTO){
        return userMongoDBService.createUserMongo(userMongoDTO);
    }

    @PostMapping("/updateMongo")
    public List<UserMongoDB> updateUserMongoDB(@RequestBody UserMongoDTO userMongoDTO){
        return userMongoDBService.updateUserMongo(userMongoDTO);
    }

    @PostMapping("/deleteMongo")
    public List<UserMongoDB> deleteUserMongoDB(@RequestParam("id") String id){
        return userMongoDBService.deleteUserMongoDB(id);
    }
}

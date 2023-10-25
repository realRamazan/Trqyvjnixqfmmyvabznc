package com.example.Trqyvjnixqfmmyvabznc.service;

import com.example.Trqyvjnixqfmmyvabznc.model.UserMongoDB;
import com.example.Trqyvjnixqfmmyvabznc.repository.UserMongoDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMongoDBService {


    @Autowired
    private UserMongoDBRepository userMongoDBRepository;



    public List<UserMongoDB> findAll() {
        return userMongoDBRepository.findAll();
    }
}

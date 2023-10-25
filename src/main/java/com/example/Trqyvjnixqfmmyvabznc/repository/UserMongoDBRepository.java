package com.example.Trqyvjnixqfmmyvabznc.repository;

import com.example.Trqyvjnixqfmmyvabznc.model.UserMongoDB;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMongoDBRepository extends MongoRepository<UserMongoDB, Integer> {

}

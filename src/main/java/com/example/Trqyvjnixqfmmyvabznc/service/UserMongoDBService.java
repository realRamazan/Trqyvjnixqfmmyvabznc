package com.example.Trqyvjnixqfmmyvabznc.service;

import com.example.Trqyvjnixqfmmyvabznc.dto.UserDTO;
import com.example.Trqyvjnixqfmmyvabznc.dto.UserMongoDTO;
import com.example.Trqyvjnixqfmmyvabznc.entity.User;
import com.example.Trqyvjnixqfmmyvabznc.model.UserMongoDB;
import com.example.Trqyvjnixqfmmyvabznc.packageFilter.Filter;
import com.example.Trqyvjnixqfmmyvabznc.repository.UserMongoDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Service
public class UserMongoDBService {


    @Autowired
    private UserMongoDBRepository userMongoDBRepository;


    public List<UserMongoDB> findAll(Filter filter) {
        return userMongoDBRepository.findAll(PageRequest.of(filter.getOffset(), filter.getLimit())).getContent();
    }

    public List<UserMongoDB> createUserMongo(UserMongoDTO userMongoDTO) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String date = dtf.format(now);
        UserMongoDB userMongoDB = new UserMongoDB();
        userMongoDB.setName(userMongoDTO.getName());
        userMongoDB.setDate(date);
        userMongoDB.setPhoneNumber1(userMongoDTO.getPhoneNumber1());
        userMongoDB.setPhoneNumber2(userMongoDTO.getPhoneNumber2());
        userMongoDB.setYearOfBirth(userMongoDTO.getYearOfBirth());
        userMongoDBRepository.save(userMongoDB);
        return userMongoDBRepository.findAll();
    }

    public List<UserMongoDB> updateUserMongo(UserMongoDTO userMongoDTO) {
        UserMongoDB userMongoDB = userMongoDBRepository.findById(userMongoDTO.getId()).orElse(null);
        if (userMongoDB == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Такого пользоватаеля не сущетсвует!");
        }
        if (userMongoDTO.getName() != null) {
            userMongoDB.setName(userMongoDTO.getName());
        }
        if (userMongoDTO.getPhoneNumber1() != null) {
            userMongoDB.setPhoneNumber1(userMongoDTO.getPhoneNumber1());
        }
        if (userMongoDTO.getPhoneNumber2() != null) {
            userMongoDB.setPhoneNumber2(userMongoDTO.getPhoneNumber2());
        }
        userMongoDBRepository.save(userMongoDB);
        return userMongoDBRepository.findAll();
    }

    public List<UserMongoDB> deleteUserMongoDB(String id) {
        Optional<UserMongoDB> userMongoDBOptional = userMongoDBRepository.findById(id);
        if (userMongoDBOptional.isPresent()) {
            UserMongoDB userMongoDB = userMongoDBOptional.get();
            userMongoDBRepository.delete(userMongoDB);
            return userMongoDBRepository.findAll();
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Такого пользоватаеля не сущетсвует!");
        }
    }

    public UserMongoDB getUserMongoDB(String id) {
        Optional<UserMongoDB> userMongoDBOptional = userMongoDBRepository.findById(id);
        if (userMongoDBOptional.isPresent()) {
            UserMongoDB userMongoDB = userMongoDBOptional.get();
            return userMongoDB;
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Такого пользоватаеля не сущетсвует!");
        }
    }
}

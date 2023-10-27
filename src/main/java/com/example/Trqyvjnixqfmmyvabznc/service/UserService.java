package com.example.Trqyvjnixqfmmyvabznc.service;

import com.example.Trqyvjnixqfmmyvabznc.dto.UserDTO;
import com.example.Trqyvjnixqfmmyvabznc.entity.User;
import com.example.Trqyvjnixqfmmyvabznc.packageFilter.Filter;
import com.example.Trqyvjnixqfmmyvabznc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;


@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Transactional
    public List<User> getAllUsers(Filter filter) {
        return userRepository.findAll(PageRequest.of(filter.getOffset(), filter.getLimit())).getContent();
    }

    public List<User> createUser(UserDTO userDTO) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String date = dtf.format(now);
        User user = new User();
        user.setName(userDTO.getName());
        user.setDate(date);
        user.setPhoneNumber1(userDTO.getPhoneNumber1());
        user.setPhoneNumber2(userDTO.getPhoneNumber2());
        user.setYearOfBirth(userDTO.getYearOfBirth());
        userRepository.save(user);
        return userRepository.findAll();
    }

    public List<User> updateUser(UserDTO userDTO) {
        User user = userRepository.findById(userDTO.getId()).orElse(null);
        if (user == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Такого пользоватаеля не сущетсвует!");
        }
        if (userDTO.getName() != null) {
            user.setName(userDTO.getName());
        }
        if (userDTO.getPhoneNumber1() != null) {
            user.setPhoneNumber1(userDTO.getPhoneNumber1());
        }
        if (userDTO.getPhoneNumber2() != null) {
            user.setPhoneNumber2(userDTO.getPhoneNumber2());
        }
        userRepository.save(user);
        return userRepository.findAll();
    }

    public User getUserById(int id) {
        Optional<User> userOpt = userRepository.findById(id);
        if (userOpt.isPresent()) {
            User user = userOpt.get();
            return user;
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Такого пользоватаеля не сущетсвует!");
        }
    }

    public List<User> deleteUser(int id) {
        Optional<User> userOpt = userRepository.findById(id);
        if (userOpt.isPresent()) {
            User user = userOpt.get();
            userRepository.delete(user);
            return userRepository.findAll();
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Такого пользоватаеля не сущетсвует!");
        }
    }
}

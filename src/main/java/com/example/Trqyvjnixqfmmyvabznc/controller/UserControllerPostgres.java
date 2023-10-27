package com.example.Trqyvjnixqfmmyvabznc.controller;

import com.example.Trqyvjnixqfmmyvabznc.dto.UserDTO;
import com.example.Trqyvjnixqfmmyvabznc.entity.User;
import com.example.Trqyvjnixqfmmyvabznc.packageFilter.Filter;
import com.example.Trqyvjnixqfmmyvabznc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping
@RestController
public class UserControllerPostgres {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String testNG() {
        return "TestNG";
    }

    @PostMapping("/users")
    public List<User> getAllUsers(@RequestBody Filter filter) {
        return userService.getAllUsers(filter);
    }

    @GetMapping("/user")
    public User getUserById(@RequestParam("id") int id) {
        return userService.getUserById(id);
    }

    @PostMapping("/create")
    public List<User> createUser(@RequestBody UserDTO userDTO) {
        return userService.createUser(userDTO);
    }

    @PostMapping("/update")
    public List<User> updateUser(@RequestBody UserDTO userDTO) {
        return userService.updateUser(userDTO);
    }

    @PostMapping("/delete")
    public List<User> deleteUser(@RequestParam("id") int id) {
        return userService.deleteUser(id);
    }
}

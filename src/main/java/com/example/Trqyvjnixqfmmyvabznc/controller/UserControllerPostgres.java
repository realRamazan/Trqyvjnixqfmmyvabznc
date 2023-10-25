package com.example.Trqyvjnixqfmmyvabznc.controller;

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

    @PostMapping("/users")
    public List<User> getAllUsers(@RequestBody Filter filter){
        System.out.println(filter.getLimit());
        return userService.getAllUsers(filter);
    }

    @GetMapping("/user")
    public User getUserById(@RequestParam("id") int id){
        return userService.getUserById(id);
    }
    @PostMapping("/create")
    public List<User> createUser(@RequestParam("name") String name,
                                 @RequestParam("phoneNumber1") String phoneNumber1,
                                 @RequestParam("phoneNumber2") String phoneNumber2,
                                 @RequestParam("yearOfBirth") String yearOfBirth){
        return userService.createUser(name, phoneNumber1, phoneNumber2, yearOfBirth);
    }

    @PostMapping("/update")
    public List<User> updateUser(@RequestParam("id") int id,
                                 @RequestParam(value = "name", required = false) String name,
                                 @RequestParam(value = "phoneNumber1", required = false) String phoneNumber1,
                                 @RequestParam(value = "phoneNumber2", required = false) String phoneNumber2){
        return userService.updateUser(id, name, phoneNumber1, phoneNumber2);
    }

    @PostMapping("/delete")
    public List<User> deleteUser(@RequestParam("id") int id){
        return userService.deleteUser(id);
    }
}

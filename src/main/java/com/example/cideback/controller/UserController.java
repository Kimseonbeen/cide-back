package com.example.cideback.controller;

import java.util.List;

import com.example.cideback.model.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cideback.model.User;
import com.example.cideback.service.UserService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

//    @PostMapping("/user")
//    public User createUser(@RequestBody User user) {
//        System.out.println("user : " + user);
//        return userService.createUser(user);
//    }

//    @PostMapping("/user/SelectUserLogin")
//    public User SelectUserLogin(@RequestBody User user) {
//        System.out.println("SelectUserLogin!!!!!");
//        System.out.println("Controller user : " + user);
//
//        return userService.SelectUserLogin(user);
//    }

}

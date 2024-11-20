package com.adil.RegistrationLogin.controller;

import com.adil.RegistrationLogin.model.User;
import com.adil.RegistrationLogin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {

        User user1 = service.registerUser(user);

        return new ResponseEntity<>(user1, HttpStatus.ACCEPTED);
    }

    @PostMapping("/login")
    public 
}

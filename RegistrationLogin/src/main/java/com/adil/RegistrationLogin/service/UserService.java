package com.adil.RegistrationLogin.service;

import com.adil.RegistrationLogin.model.User;
import com.adil.RegistrationLogin.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {

        return userRepository.save(user);
    }
}

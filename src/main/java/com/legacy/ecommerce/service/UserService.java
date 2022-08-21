package com.legacy.ecommerce.service;


import com.legacy.ecommerce.model.Product;
import com.legacy.ecommerce.model.User;
import com.legacy.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;


    public User authenticate(String email, String password){
        return userRepository.findByEmailAndPassword(email, password).orElse(null);

    }

    public List<User> getAllUsers () {
        return userRepository.findAll();
    }

    public void addUser(User user){
        userRepository.save(user);
    }
}

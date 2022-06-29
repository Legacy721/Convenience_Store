package com.legacy.ecommerce.service;


import com.legacy.ecommerce.model.User;
import com.legacy.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

//    public UsersModel registerUser(String firstName, String lastName, String email, String password){
//        if(email != null && password != null){
//            UsersModel usersModel = new UsersModel();
//            usersModel.setFirstName();
//        }
//    }

    @Autowired
    private UserRepository userRepository;

//    public User login (String email, String password){
//        User  user = userRepository.findByEmailAndPassword(email, password);
//
//        return user;
//    }

    public User create(User userDto) {

        if(userDto.getEmail() != null && userDto.getPassword() !=null){
            User user = User.builder()
                    .firstName(userDto.getFirstName())
                    .lastName(userDto.getLastName())
                    .email(userDto.getEmail())
                    .password(userDto.getPassword())
                    .build();
            return userRepository.save(user);
        }
        return null;
    }

    public User authenticate(String email, String password){
        return userRepository.findByEmailAndPassword(email, password).orElse(null);

    }

    public List<User> getAllUsers () {
        return userRepository.findAll();
    }
}

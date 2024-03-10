package org.example.turfbookingbackend.service;

import org.example.turfbookingbackend.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


public  interface UserService {

    public List<User> findAll();

    public User addUser(User user);
    public ResponseEntity verifyUser(User user);
    public boolean checkUser(String email);

}

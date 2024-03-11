package org.example.turfbookingbackend.controller;

import org.example.turfbookingbackend.model.User;
import org.example.turfbookingbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user/")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

    UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/customer/all")
    List<User> findAll(){ return userService.findAll();}

    @PostMapping(value = "/customer/register")
    public ResponseEntity addUser(@RequestBody User user){
        user = userService.addUser(user);
        return ResponseEntity.ok(user);
    }
    @PostMapping(value = "/login")
    public ResponseEntity verifyUser(@RequestBody User user){
        return ResponseEntity.ok(userService.verifyUser(user));
    }
}

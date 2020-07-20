package com.elimu.elimuappbackend.controllers;

import com.elimu.elimuappbackend.model.User;
import com.elimu.elimuappbackend.repos.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersResource {

    @Autowired
    private UsersRepo usersRepo;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return usersRepo.findAll();
    }

    @PostMapping("/users")
    public User registerUser(@RequestBody User user){
      return   usersRepo.save(user);
    }

    @GetMapping("/users/{userId}")
    public User fetchUser(@PathVariable String userId){
     return usersRepo.findById(userId).orElse(null);
    }


    @PatchMapping("/users")
    public User updateUser(@RequestBody User user){
       return usersRepo.save(user);
    }

}

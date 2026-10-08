package com.jpa.user_api.controller;

import com.jpa.user_api.entity.User;
import com.jpa.user_api.service.impl.UserServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserServicesImpl userServices;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userServices.register(user);
    }

    @GetMapping("/userid/{id}")
    public User getById(@PathVariable int id) {
        return userServices.getById(id);
    }

    @PutMapping("/update/{id}")
    public User changeData(@PathVariable int id, @RequestBody User user){
        return userServices.changeUserInfo(id, user);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id){
        userServices.deleteUserInfo(id);
        return "User " + id + " is deleted.";
    }

    @GetMapping("/findbyemail")
    public User getByEmail(@RequestParam String email) {
        return userServices.findByEmail(email);
    }

}

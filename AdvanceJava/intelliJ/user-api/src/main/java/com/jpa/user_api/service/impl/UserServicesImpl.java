package com.jpa.user_api.service.impl;

import com.jpa.user_api.dao.UserRepository;
import com.jpa.user_api.entity.User;
import com.jpa.user_api.exception.UserNotFoundException;
import com.jpa.user_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class UserServicesImpl implements UserService {

    private final UserRepository userRepository;

    public UserServicesImpl(@Autowired UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User register(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getById(int id) {
//        User u = userRepository.findById(id).orElseThrow();
//        return u;

        Optional<User> op = userRepository.findById(id);
        if(op.isPresent()) {
            return (User) op.get();
        } else {
            throw new UserNotFoundException("User not found");
        }
    }

    @Override
    public User changeUserInfo(int id, User user){
        if(userRepository.existsById(id)){
            userRepository.save(user);
            return user;
        } else {
            throw new UserNotFoundException("User " + id + " is not available");
        }
    }

    @Override
    public void deleteUserInfo(int id) {
        User u = userRepository.findById(id).orElseThrow(() -> new  UserNotFoundException("User not found"));
        userRepository.delete(u);
    }

    @Override
    public User findByEmail(String email) {
        User u = userRepository.findByEmail(email);
        if(u == null){
            throw new UserNotFoundException("user not found");
        }
        return u;
    }

}

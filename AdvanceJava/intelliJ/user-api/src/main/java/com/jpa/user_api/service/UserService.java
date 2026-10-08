package com.jpa.user_api.service;

import com.jpa.user_api.entity.User;

public interface UserService {

    User register(User user);

    User getById(int id);

    void deleteUserInfo(int id);

    User changeUserInfo(int id, User user);

    User findByEmail(String email);
}

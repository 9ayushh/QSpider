package com.jpa.user_api.exception;

public class UserAlreadyPresent extends RuntimeException{
    public UserAlreadyPresent(String message) {
        super(message);
    }
}

package com.mp17017.fullStackBackendone.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Could not find a user with the id " + id);
    }
}

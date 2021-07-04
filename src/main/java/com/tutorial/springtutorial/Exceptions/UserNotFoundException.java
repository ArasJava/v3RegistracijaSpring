package com.tutorial.springtutorial.Exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
    super(message);
    }
}

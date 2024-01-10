package com.backend.spring.exception;

public class UserNotFoundExecption extends RuntimeException{
    public UserNotFoundExecption(Long id){
    super("could not  found  the user  with id "+ id);
    }
}

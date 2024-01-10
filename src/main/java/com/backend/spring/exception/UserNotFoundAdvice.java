package com.backend.spring.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class UserNotFoundAdvice {
    

    @ResponseBody
    @ExceptionHandler(UserNotFoundExecption.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String,String>ExceptionHandler(UserNotFoundExecption execption){
        Map<String,String> errorMap=new  HashMap<>();
        errorMap.put("errorMessage", execption.getMessage());

        return errorMap;
    }
}

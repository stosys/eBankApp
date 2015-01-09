package com.ebankapp.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ErrorHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String handle(Exception exception){
        exception.printStackTrace();
        return exception.getMessage();
    }
}

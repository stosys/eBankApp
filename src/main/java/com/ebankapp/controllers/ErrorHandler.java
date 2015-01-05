package com.ebankapp.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Sergiu on 1/4/2015.
 */
@ControllerAdvice
public class ErrorHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String handle(Exception exception){
        exception.printStackTrace();
        return exception.getMessage();
    }
}

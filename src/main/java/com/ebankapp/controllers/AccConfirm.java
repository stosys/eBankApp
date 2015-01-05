package com.ebankapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(Links.CONFIRM)
public class AccConfirm {

    @RequestMapping(method = RequestMethod.GET)
    public String getIndex(){
        return "account/confirm";
    }
}

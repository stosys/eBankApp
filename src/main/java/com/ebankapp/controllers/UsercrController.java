package com.ebankapp.controllers;

import com.ebankapp.models.Client;
import com.ebankapp.services.UserService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(Links.USERCR)
public class UsercrController {

    private UserService userService;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @ResponseBody
    public String createAcc(@ModelAttribute Client client){
        userService.create(client);
        //TODO: Search ModelView
        return client.getMail();
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getIndex(){
        return "usercr/usercr";
    }
}

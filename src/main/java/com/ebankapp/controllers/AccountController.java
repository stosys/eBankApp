package com.ebankapp.controllers;

import com.ebankapp.models.Cont;
import com.ebankapp.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(Links.ACCOUNTS)
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @ResponseBody
    public String createAcc(@ModelAttribute Cont cont){
        accountService.create(cont);
        return cont.getMail();
    }
/*
    @RequestMapping(method = RequestMethod.GET,value = "{id}")
    public String getAccById(@RequestParam("id")long id){
        Cont cont = accountService.getById(id);
        return "home";
    }*/



    @RequestMapping(method = RequestMethod.GET)
    public String getIndex(){
        return "employee/account";
    }
}

package com.ebankapp.controllers;

import com.ebankapp.models.Cont;
import com.ebankapp.repositories.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(Links.ACCOUNTS)
public class AccountController {
   /* private AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService){
        this.accountService=accountService;
    }*/

    @RequestMapping(method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String createAcc(@RequestBody Cont cont){
        System.out.println(cont.getCnp());
        //accountService.create(cont);
        return "home";
    }
/*
    @RequestMapping(method = RequestMethod.GET,value = "{id}")
    public String getAccById(@RequestParam("id")long id){
        Cont cont = accountService.getById(id);
        return "home";
    }*/
    @RequestMapping(method = RequestMethod.GET)
    public String getIndex(){
        return "account/account";
    }
}

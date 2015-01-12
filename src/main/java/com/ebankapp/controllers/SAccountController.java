package com.ebankapp.controllers;

import com.ebankapp.models.ContSpecial;
import com.ebankapp.services.SAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(Links.SACCOUNT)
public class SAccountController{

    @Autowired
    private SAccountService sAccountService;

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String createSAccount(@ModelAttribute ContSpecial contSpecial){
        sAccountService.create(contSpecial);
        return contSpecial.getMail();
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getIndex(){
        return "employee/saccount";
    }
}

package com.ebankapp.controllers;

import com.ebankapp.models.UserPass;
import com.ebankapp.repositories.EmployeeRepository;
import com.ebankapp.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(Links.EMPAUTH)
public class EmpController {

    @RequestMapping(method = RequestMethod.GET)
    public String getIndex(){
        return "employee/empauth";
    }

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(method = RequestMethod.POST)
    public String getIndex(@RequestBody UserPass userPass){
        if (employeeService.validate(userPass))
            return "employee/empop";
        return "Invalid username or password";
    }


}

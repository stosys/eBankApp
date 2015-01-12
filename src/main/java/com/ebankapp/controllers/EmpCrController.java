package com.ebankapp.controllers;

import com.ebankapp.models.Angajat;
import com.ebankapp.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(Links.EMPC)
public class EmpCrController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @ResponseBody
    public String createEmp(@ModelAttribute Angajat angajat){
        employeeService.create(angajat);
        return angajat.getMail();
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getIndex() {
        return "admin/employeecr";
    }

}

package com.ebankapp.services;

import com.ebankapp.models.Angajat;
import com.ebankapp.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Angajat create(Angajat angajat) {

        Angajat creat=employeeRepository.create(angajat);
        if (creat==null)
            throw new RuntimeException();
        return creat;
    }

    @Override
    public Angajat getCont(long id) {
        return null;
    }

    @Override
    public Angajat updateCont(long id, Angajat angajat) {
        return null;
    }

    @Override
    public void deleteCont(long id) {

    }
}

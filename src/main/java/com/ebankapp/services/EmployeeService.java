package com.ebankapp.services;

import com.ebankapp.models.Angajat;

public interface EmployeeService {
    Angajat create(Angajat angajat);
    Angajat getCont(long id);
    Angajat updateCont(long id, Angajat angajat);
    void deleteCont(long id);
}

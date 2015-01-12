package com.ebankapp.services;

import com.ebankapp.models.Angajat;
import com.ebankapp.models.UserPass;

public interface EmployeeService {
    Angajat create(Angajat angajat);
    Angajat getCont(long id);
    Angajat updateCont(long id, Angajat angajat);
    void deleteCont(long id);
    boolean validate(UserPass userPass);
}

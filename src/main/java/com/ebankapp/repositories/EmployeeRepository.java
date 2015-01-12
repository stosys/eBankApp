package com.ebankapp.repositories;

import com.ebankapp.models.Angajat;
import com.ebankapp.models.UserPass;

public interface EmployeeRepository {
    Angajat create(Angajat angajat);
    Angajat update(Angajat angajat);
    void delete(Angajat angajat);
    Angajat getByEmail(String email);
}

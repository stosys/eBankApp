package com.ebankapp.repositories;

import com.ebankapp.models.Angajat;

public interface EmployeeRepository {
    Angajat create(Angajat angajat);
    Angajat update(Angajat angajat);
    void delete(Angajat angajat);
}

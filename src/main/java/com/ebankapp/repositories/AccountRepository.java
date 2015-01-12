package com.ebankapp.repositories;


import com.ebankapp.models.Client;
import com.ebankapp.models.Cont;

public interface AccountRepository {

    Cont create(Cont cont);
    Cont getById(long id);
    Cont update(Cont cont);
    void delete(Cont cont);
}

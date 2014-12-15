package com.ebankapp.repositories;


import com.ebankapp.models.Client;
import com.ebankapp.models.Cont;

public interface AccountService {

    public void create(Cont cont);
    public Cont getById(long id);
}

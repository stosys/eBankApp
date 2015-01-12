package com.ebankapp.services;

import com.ebankapp.models.Cont;

public interface AccountService {
    Cont create(Cont cont);
    Cont getCont(long id);
    Cont updateCont(long id, Cont cont);
    void deleteCont(long id);
}

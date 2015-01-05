package com.ebankapp.services;

import com.ebankapp.models.Cont;

/**
 * Created by Sergiu on 1/4/2015.
 */
public interface AccountService {
    Cont create(Cont cont);
    Cont getCont(long id);
    Cont update(long id, Cont cont);
    void delete(long id);
}

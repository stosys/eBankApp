package com.ebankapp.services;

import com.ebankapp.models.Cont;
import com.ebankapp.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Cont create(Cont cont) {
        Cont creat=accountRepository.create(cont);
        if (creat==null)
            throw new RuntimeException();
        return creat;
    }

    @Override
    public Cont getCont(long id) {
        return null;
    }

    @Override
    public Cont updateCont(long id, Cont cont) {
        return null;
    }

    @Override
    public void deleteCont(long id) {

    }
}

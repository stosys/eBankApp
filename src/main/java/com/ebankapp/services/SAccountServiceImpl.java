package com.ebankapp.services;

import com.ebankapp.models.ContSpecial;
import com.ebankapp.repositories.SAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SAccountServiceImpl implements SAccountService {

    @Autowired
    private SAccountRepository sAccountRepository;

    @Override
    public ContSpecial create(ContSpecial contSpecial) {
        ContSpecial creat=sAccountRepository.create(contSpecial);
        if (creat==null)
            throw new RuntimeException();
        return creat;
    }

    @Override
    public ContSpecial update(long id, ContSpecial contSpecial) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}

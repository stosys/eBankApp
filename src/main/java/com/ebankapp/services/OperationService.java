package com.ebankapp.services;


import com.ebankapp.models.Operatie;

public interface OperationService {
    Operatie create(Operatie operatie);
    Operatie update(long id,Operatie operatie);
    void delete(long id);
}

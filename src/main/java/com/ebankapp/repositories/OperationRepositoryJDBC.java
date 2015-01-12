package com.ebankapp.repositories;

import com.ebankapp.models.Operatie;
import org.springframework.stereotype.Repository;

@Repository
public class OperationRepositoryJDBC implements OperationRepository{
    @Override
    public Operatie create(Operatie operatie) {
        return null;
    }

    @Override
    public Operatie update(Operatie operatie) {
        return null;
    }

    @Override
    public void delete(Operatie operatie) {

    }
}

package com.ebankapp.repositories;

import com.ebankapp.models.Operatie;
import org.springframework.expression.Operation;

public interface OperationRepository {
    Operatie create(Operatie operatie);
    Operatie update(Operatie operatie);
    void delete(Operatie operatie);
}

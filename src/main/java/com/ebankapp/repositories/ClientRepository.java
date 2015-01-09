package com.ebankapp.repositories;

import com.ebankapp.models.Client;

public interface ClientRepository {

    public Client create(Client client);
    Client update(Client client);
    void delete(Client client);
}

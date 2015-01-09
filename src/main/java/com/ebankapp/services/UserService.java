package com.ebankapp.services;

import com.ebankapp.models.Client;

public interface UserService {
    Client create(Client client);
    Client getClient(long id);
    Client updateClient(long id,Client client);
    void deleteClient(long id);
}

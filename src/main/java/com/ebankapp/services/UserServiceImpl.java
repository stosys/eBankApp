package com.ebankapp.services;

import com.ebankapp.models.Client;
import com.ebankapp.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client create(Client client) {
        Client creat=clientRepository.create(client);
        if (creat==null){
            throw new RuntimeException();
        }
        return creat;
    }

    @Override
    public Client getClient(long id) {
        return null;
    }

    @Override
    public Client updateClient(long id, Client client) {
        return null;
    }

    @Override
    public void deleteClient(long id) {

    }
}

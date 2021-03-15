package com.epi.gestion.service.impl;

import com.epi.gestion.dao.IClientDao;
import com.epi.gestion.dao.entity.Client;
import com.epi.gestion.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

public class ClientServiceImpl implements IClientService {

    @Autowired
    private IClientDao clientDao;

    @Override
    public List<Client> getAllclients() {
        return clientDao.getAllclients();
    }

    @Override
    public Client add(Client client) {
        return clientDao.addClients(client);
    }

    @Override
    public boolean update(Client client) {
        return clientDao.updateClient(client);
    }

    @Override
    public boolean deleteById(Long id) {
        return clientDao.deleteClient(id);
    }

    @Override
    public Client findById(Long id) {
        Optional<Client> clientOptional =clientDao.findById(id);
        return clientOptional.orElseThrow(()-> new EntityNotFoundException("client not found with id: " + id));
    }
}

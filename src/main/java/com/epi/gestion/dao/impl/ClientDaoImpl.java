package com.epi.gestion.dao.impl;

import com.epi.gestion.dao.IClientDao;
import com.epi.gestion.dao.entity.Client;
import com.epi.gestion.dao.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientDaoImpl implements IClientDao {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> getAllclients() {
        return clientRepository.findAll();
    }

    @Override
    public Client addClients(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public boolean updateClient(Client client) {
        if (clientRepository.save(client) !=null)
            return true;
        else
            return false;
    }

    @Override
    public boolean deleteClient(Long id) {
        if (clientRepository.existsById(id)){
            clientRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteClient(Client client) {
        return false;
    }

    @Override
    public Optional<Client> findById(Long id) {
        return clientRepository.findById(id);
    }
}

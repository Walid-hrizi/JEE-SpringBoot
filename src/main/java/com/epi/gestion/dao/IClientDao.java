package com.epi.gestion.dao;

import com.epi.gestion.dao.entity.Client;

import java.util.List;
import java.util.Optional;

public interface IClientDao {
    List<Client> getAllclients();

    Client addClients(Client client);

    boolean updateClient(Client client);

    boolean deleteClient(Long id);

    boolean deleteClient(Client client);

    Optional<Client> findById(Long id);

}

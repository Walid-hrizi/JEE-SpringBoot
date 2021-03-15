package com.epi.gestion.service;

import com.epi.gestion.dao.entity.Client;

import java.util.List;

public interface IClientService {
    List<Client> getAllclients();
    Client add (Client client);
    boolean update (Client client);
    boolean deleteById (Long id);
    Client findById (Long id);
}


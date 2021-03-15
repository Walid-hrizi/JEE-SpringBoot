package com.epi.gestion.controller;


import com.epi.gestion.dao.entity.Client;
import com.epi.gestion.service.IClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    private IClientService clientService;

    @GetMapping("/")
    public List<Client> getClients(){
        return  clientService.getAllclients();

    }
    @GetMapping("/find")
    public Client getClient(Long id){
        return  clientService.findById(id);

    }
    @GetMapping("/add")
    public Client addClient(Client client){
        return  clientService.add(client);

    }
    @GetMapping("/remove")
    public boolean deleteClient(Long id){
        return  clientService.deleteById(id);

    }
    @GetMapping("/update")
    public boolean updateClient(Client client){
        return  clientService.update(client);

    }

}

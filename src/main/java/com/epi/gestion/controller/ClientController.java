package com.epi.gestion.controller;


import com.epi.gestion.dao.entity.Client;
import com.epi.gestion.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private IClientService clientService;

    @GetMapping("/")
    public List<Client> getClients(){
        return  clientService.getAllclients();

    }
    @GetMapping("/find")
    public Client getClient(@RequestParam Long id){
        return  clientService.findById(id);

    }
    @PostMapping("/add")
    public Client addClient(@RequestBody Client client){
        return  clientService.add(client);

    }
    @DeleteMapping("/remove")
    public boolean deleteClient(@RequestParam Long id){
        return  clientService.deleteById(id);

    }
    @PutMapping ("/update")
    public boolean updateClient(@RequestBody Client client){
        return  clientService.update(client);

    }

}

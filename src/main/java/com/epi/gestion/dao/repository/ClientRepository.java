package com.epi.gestion.dao.repository;

import com.epi.gestion.dao.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}

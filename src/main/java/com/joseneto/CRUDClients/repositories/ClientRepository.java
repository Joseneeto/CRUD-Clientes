package com.joseneto.CRUDClients.repositories;

import com.joseneto.CRUDClients.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}

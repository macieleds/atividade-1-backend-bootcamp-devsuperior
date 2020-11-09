package com.edisonmaciel.clients.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edisonmaciel.clients.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}

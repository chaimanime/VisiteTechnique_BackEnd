package com.example.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Client;

public interface ClientRepository extends JpaRepository <Client, Long>  {
	Client findByUsernameAndPassword(String username,String password);
	//Optional<Client> findByCode_Client(Long id);

}

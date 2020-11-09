package com.edisonmaciel.clients.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edisonmaciel.clients.dto.ClientDTO;
import com.edisonmaciel.clients.entities.Client;
import com.edisonmaciel.clients.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Transactional(readOnly = true)
	public Page<ClientDTO> findAllPaged(PageRequest pageRequest) {
		Page<Client> clientList = clientRepository.findAll(pageRequest);
		return clientList.map(x -> new ClientDTO(x));
	}

}

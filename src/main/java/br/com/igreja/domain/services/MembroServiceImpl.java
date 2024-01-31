package br.com.igreja.domain.services;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.igreja.infrastructure.repositories.MembroRepository;

public class MembroServiceImpl implements MembroService{
	@Autowired
	MembroRepository membroRepository;
	
	
	

}

package br.com.igreja.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.igreja.domain.interfaces.MembroService;
import br.com.igreja.domain.models.Membro;
import br.com.igreja.infrastructure.repositories.MembroRepository;

public class MembroServiceImpl implements MembroService{
	@Autowired
	MembroRepository membroRepository;

	@Override
	public List<Membro> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}

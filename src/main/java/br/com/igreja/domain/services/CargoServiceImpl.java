package br.com.igreja.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.igreja.domain.interfaces.CargoService;
import br.com.igreja.domain.models.Cargo;
import br.com.igreja.infrastructure.repositories.CargoRepository;

public class CargoServiceImpl implements CargoService{
	
	@Autowired
	CargoRepository cargoRepository;

	@Override
	public List<Cargo> findAll() throws Exception {
		
		return (List<Cargo>) ((CargoService) cargoRepository).findAll();
	}
  
	

}

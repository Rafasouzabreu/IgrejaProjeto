package br.com.igreja.domain.interfaces;

import java.util.List;

import br.com.igreja.domain.models.Cargo;

public interface CargoService {
	
	List<Cargo> findAll() throws Exception;

}

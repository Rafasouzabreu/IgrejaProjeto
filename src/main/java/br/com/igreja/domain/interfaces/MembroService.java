package br.com.igreja.domain.interfaces;

import java.util.List;

import br.com.igreja.domain.models.Membro;

public interface MembroService {
	
	List<Membro> findAll() throws Exception;

}

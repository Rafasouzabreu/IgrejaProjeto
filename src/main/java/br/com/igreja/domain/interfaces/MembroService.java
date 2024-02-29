package br.com.igreja.domain.interfaces;

import java.util.List;
import java.util.UUID;

import br.com.igreja.application.dtos.MembroPostDto;
import br.com.igreja.application.dtos.MembroPutDto;
import br.com.igreja.domain.models.Membro;
import jakarta.validation.Valid;

public interface MembroService {
	
	void create(@Valid MembroPostDto dto) throws Exception;
	void update(MembroPutDto membro) throws Exception;
    void delete(UUID id)throws Exception;
    
    List<Membro> findAll() throws Exception;
    public Membro findById (UUID id) throws Exception;
}

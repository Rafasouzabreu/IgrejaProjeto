package br.com.igreja.domain.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.igreja.application.dtos.MembroPostDto;
import br.com.igreja.domain.interfaces.MembroService;
import br.com.igreja.domain.models.Cargo;
import br.com.igreja.domain.models.Membro;
import br.com.igreja.infrastructure.repositories.CargoRepository;
import br.com.igreja.infrastructure.repositories.DepartamentoRepository;
import br.com.igreja.infrastructure.repositories.MembroRepository;
import jakarta.validation.Valid;

public abstract class MembroServiceImpl implements MembroService{
	@Autowired
	MembroRepository membroRepository;
	
	@Autowired
	CargoRepository cargoRepository;
	
	@Autowired
	DepartamentoRepository departamentoRepository;

	@Override
	public List<Membro> findAll() throws Exception {
		
		return (List<Membro>) ((MembroService) membroRepository).findAll();
	}

	@Override
	public void create(@Valid MembroPostDto dto) {
		
		Membro membro = new Membro();
		
		membro.setNome(dto.getNome());
		membro.setIdentidade(dto.getIdentidade());
		membro.setCpf(dto.getIdentidade());
		membro.setSexo(dto.getSexo());
		//membro.setCargo(obterCargo(dto.getCargo()));
		membro.setDepartamento(dto.getDepartamento());
		
		membroRepository.save(membro);
		
	}

	

	//private Cargo obterCargo(UUID Id) {
		
		//Optional<Cargo> cargo = CargoRepository.findById(Id);
//}

	public Membro findById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	

}

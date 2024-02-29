package br.com.igreja.domain.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.igreja.application.dtos.MembroPostDto;
import br.com.igreja.application.dtos.MembroPutDto;
import br.com.igreja.domain.interfaces.MembroService;
import br.com.igreja.domain.models.Cargo;
import br.com.igreja.domain.models.Departamento;
import br.com.igreja.domain.models.Membro;
import br.com.igreja.infrastructure.repositories.CargoRepository;
import br.com.igreja.infrastructure.repositories.DepartamentoRepository;
import br.com.igreja.infrastructure.repositories.MembroRepository;
import jakarta.validation.Valid;
@Service
public abstract class MembroServiceImpl implements MembroService {
	@Autowired
	MembroRepository membroRepository;

	@Autowired
	CargoRepository cargoRepository;

	@Autowired
	DepartamentoRepository departamentoRepository;

	@Override
	public void create(@Valid MembroPostDto dto) {

		Membro membro = new Membro();

		membro.setNome(dto.getNome());
		membro.setIdentidade(dto.getIdentidade());
		membro.setCpf(dto.getCpf());
		membro.setCargo(dto.getCargo());
		membro.setDepartamento(dto.getDepartamento());

		membroRepository.save(membro);

	}

	@Override
	public void update(MembroPutDto dto) throws Exception {

		Membro membro = findById(dto.getId());

		membro.setNome(dto.getNome());
		membro.setIdentidade(dto.getIdentidade());
		membro.setCpf(dto.getCpf());
		membro.setCargo(dto.getCargo());
		membro.setDepartamento(dto.getDepartamento());

		membroRepository.save(membro);

	}

	@Override
	public void delete(UUID id) throws Exception {

		Membro membro = findById(id);
		membroRepository.delete(membro);
	}

	@Override
	public List<Membro> findAll() throws Exception {
		return (List<Membro>) membroRepository.findAll();
	}

	@Override
	public Membro findById(UUID id) throws Exception {
		Optional<Membro> membro = membroRepository.findById(id);
		if (membro.isEmpty())
			throw new IllegalArgumentException("Membro não encontrado. Verifique o ID Informado.");

		return membro.get();
	}

	
	

	private Cargo obterCargo(UUID id) {

		Optional<Cargo> cargo = cargoRepository.findById(id);

		if (cargo.isEmpty())
			throw new IllegalArgumentException("Erro. O Cargo informado não existe.");

		return cargo.get();
	}

	private Departamento obterDepartamento(UUID id) throws Exception {
		Optional<Departamento> departamento = departamentoRepository.findById(id);
		if (departamento.isEmpty())
			throw new IllegalArgumentException("Erro.O Departamento informado não existe.");

		return departamento.get();
	}

}

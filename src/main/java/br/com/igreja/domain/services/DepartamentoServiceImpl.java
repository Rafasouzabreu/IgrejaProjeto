package br.com.igreja.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.igreja.domain.interfaces.DepartamentoService;
import br.com.igreja.domain.models.Departamento;
import br.com.igreja.infrastructure.repositories.DepartamentoRepository;

public class DepartamentoServiceImpl implements DepartamentoService{
	@Autowired
	DepartamentoRepository departamentoRepository;

	@Override
	public List<Departamento> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}


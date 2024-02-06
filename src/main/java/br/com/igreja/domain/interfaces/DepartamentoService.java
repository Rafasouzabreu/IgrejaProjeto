package br.com.igreja.domain.interfaces;

import java.util.List;

import br.com.igreja.domain.models.Departamento;

public interface DepartamentoService {
	List <Departamento> findAll() throws Exception;

}

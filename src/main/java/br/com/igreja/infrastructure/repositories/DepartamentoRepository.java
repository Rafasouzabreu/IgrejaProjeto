package br.com.igreja.infrastructure.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.igreja.domain.models.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, UUID> {

	

}

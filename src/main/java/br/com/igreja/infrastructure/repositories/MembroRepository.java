package br.com.igreja.infrastructure.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.igreja.domain.models.Membro;

public interface MembroRepository extends JpaRepository<Membro, UUID> {



}

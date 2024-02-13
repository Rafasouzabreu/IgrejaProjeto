package br.com.igreja.infrastructure.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.igreja.domain.models.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, UUID> {
    
}

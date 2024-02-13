package br.com.igreja.domain.models;

import java.util.UUID;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "tbl_membro")
@Data
public class Membro {

	@Id
	@Column(name = "id_pk")
	private UUID id;
	
	@Column(name = "identidade", length = 10 , nullable = false )
	private Double identidade;
	
	@Column(name = "cpf", length = 11, nullable = false)
	private Double Cpf;
	
	@Column(name = "nome", length = 100, nullable = false)
	private String nome;
	
	@Column(name = "endereço", length = 200, nullable = false)
	private String endereço;
	
	@Column(name = "sexo", length = 8, nullable = false)
	private String Sexo;
	
	@JoinColumn(name = "cargo_id_pk", nullable = true )
    private Cargo cargo;
	
	@JoinColumn(name = "cargo_id_pk", nullable = true )
	private Departamento departamento;
}
package br.com.igreja.application.dtos;

import java.util.UUID;

import lombok.Data;

@Data
public class MembroGetDto {
	
	private UUID id;
	private Double identidade;
	private Double cpf;
	private String nome;
	private String endereco;
	private String sexo;
	private CargoGetDto cargo;
	private DepartamentoGetDto departamento;

}

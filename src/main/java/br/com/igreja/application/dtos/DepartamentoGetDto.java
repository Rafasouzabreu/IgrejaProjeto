package br.com.igreja.application.dtos;

import java.util.UUID;

import lombok.Data;

@Data
public class DepartamentoGetDto {
	
	private UUID id; 
	private String descricao;

}

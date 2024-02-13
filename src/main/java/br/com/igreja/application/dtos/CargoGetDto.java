package br.com.igreja.application.dtos;

import java.util.UUID;

import lombok.Data;

@Data
public class CargoGetDto {
	
	private UUID id;
	private String nome;

}

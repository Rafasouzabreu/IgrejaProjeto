package br.com.igreja.domain.models;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "membro")
public class Membro {

	@Id
	private UUID id;
	private Double identidade;
	private Double Cpf;
	private String nome;
	private String endereço;
}
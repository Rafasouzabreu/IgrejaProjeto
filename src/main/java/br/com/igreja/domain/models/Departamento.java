package br.com.igreja.domain.models;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@Data
@Document(collection = "departamento")
public class Departamento {
	@Id
	private UUID id;
	private String nome;
	private String descricao;

}

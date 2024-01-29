package br.com.igreja.domain.models;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "cargo")
public class Cargo {
  @Id
  private UUID id;
  private String nome;
	
	
	
}

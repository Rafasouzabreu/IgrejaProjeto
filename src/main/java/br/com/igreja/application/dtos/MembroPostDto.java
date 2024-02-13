package br.com.igreja.application.dtos;

import br.com.igreja.domain.models.Cargo;
import br.com.igreja.domain.models.Departamento;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class MembroPostDto {
   
	@NotBlank(message = "Informe o nome do membro.")
	private String nome;
	
	@NotBlank(message = "Informe a identidade do membro.")
	private Double Identidade;
	
	@NotBlank(message = "informe o cpf do membro.")
	private Double cpf;
	
	@NotBlank(message = "Informe o sexo do membro.")
	private String sexo;
	
	private Cargo cargo;
	
	private Departamento departamento;
}

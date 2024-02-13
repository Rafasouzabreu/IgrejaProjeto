package br.com.igreja.application.dtos;

import java.util.UUID;

import br.com.igreja.domain.models.Cargo;
import br.com.igreja.domain.models.Departamento;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class MembroPutDto {
    @NotNull(message = "Informe o id do membro desejado.")
	private UUID id;
    
    @Size(min = 8, max = 100, message = "Nome do Membro deve ter de 8 a 100 caracteres.")
	@NotBlank(message = "Informe a identidade do membro.")
	private Double identidade;
    
    @NotNull(message = "Informe o cpf do membro.")
	private Double Cpf;
    
    @NotNull(message = "Informe o nome do membro.")
	private String nome;
    
    @NotNull(message = "Informe o endereço do membro.")
	private String endereço;
    
    @NotNull(message = "Informe o sexo do membro.")
	private String Sexo;

   
	private Cargo Cargo;

	private Departamento Departamento;

}

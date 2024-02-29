package br.com.igreja.application.controllers;

import java.util.List;

import org.hibernate.validator.constraints.UUID;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.igreja.application.dtos.MembroGetDto;
import br.com.igreja.application.dtos.MembroPostDto;
import br.com.igreja.application.dtos.MembroPutDto;
import br.com.igreja.application.dtos.SuccessResponseDto;
import br.com.igreja.domain.interfaces.MembroService;
import br.com.igreja.domain.models.Membro;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/api/membros")
public class MembroController {
    
	
	private final MembroService membroService = null;
 
	
	private final ModelMapper modelMapper = null;

	@PostMapping
	public ResponseEntity<SuccessResponseDto> post(@RequestBody @Valid MembroPostDto dto) throws Exception {

		membroService.create(dto);

		SuccessResponseDto response = new SuccessResponseDto();
		response.setStatus(HttpStatus.CREATED);
		response.setMessage("Membro cadastrado com sucesso.");

		return ResponseEntity.status(201).body(response);

	}

	@PutMapping
	public ResponseEntity<SuccessResponseDto> put(@RequestBody @Valid MembroPutDto dto) throws Exception {

		membroService.update(dto);

		SuccessResponseDto response = new SuccessResponseDto();
		response.setStatus(HttpStatus.OK);
		response.setMessage("Membro atualizado com Sucesso.");
		return ResponseEntity.status(200).body(response);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<SuccessResponseDto> delete(@PathVariable("id") UUID id) throws Exception {
	    //membroService.delete(id);

		SuccessResponseDto response = new SuccessResponseDto();
		response.setStatus(HttpStatus.OK);
		response.setMessage("Membro excluido com sucesso.");

		return ResponseEntity.status(200).body(response);
	}

	
	@GetMapping
	public List<MembroGetDto> getAll() throws Exception{
		
		List<Membro> membros = membroService.findAll();
		
		List<MembroGetDto> result = modelMapper.map(membros,
				new TypeToken<List<MembroGetDto>>() {}.getType());
		return result;
		
		
	}
}

package com.davidchavess.findByFilmesSeries.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davidchavess.findByFilmesSeries.dto.UsuarioDto;
import com.davidchavess.findByFilmesSeries.services.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {
	
	@Autowired
	private UsuarioService service;
	
	@GetMapping
	public ResponseEntity<List<UsuarioDto>> findAll(){	
		
		List<UsuarioDto> lista = service.findAll()
			.stream()
			.map(u -> new UsuarioDto(u))
			.collect(Collectors.toList());
		
		return ResponseEntity.ok().body(lista);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<UsuarioDto> findById( @PathVariable Long id){
		
		UsuarioDto u = new UsuarioDto(service.findById(id));		
		return ResponseEntity.ok().body(u);
		
	}
}

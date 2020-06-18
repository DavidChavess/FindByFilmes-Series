package com.davidchavess.findByFilmesSeries.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davidchavess.findByFilmesSeries.dto.ProducaoFilmeDto;
import com.davidchavess.findByFilmesSeries.entidades.Categoria;
import com.davidchavess.findByFilmesSeries.entidades.ProducaoFilme;
import com.davidchavess.findByFilmesSeries.services.ProducaoFilmeService;

@RestController
@RequestMapping(value = "/filmes")
public class ProducaoFilmeResource {
	
	@Autowired
	private ProducaoFilmeService service;
	
	@GetMapping()
	public ResponseEntity<List<ProducaoFilmeDto>> findAll(){
		List<ProducaoFilmeDto> lista;
	
		// convertendo lista de producaoFilme em lista de producaoFilmeDto
		lista = service.findAll().stream()
		.map( p -> new ProducaoFilmeDto( (ProducaoFilme) p) )
		.collect(Collectors.toList());
		
		return ResponseEntity.ok().body(lista);
				
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<List<ProducaoFilmeDto>> findByCategoriaId( @PathVariable Long id){
		List<ProducaoFilmeDto> lista;
		Categoria cat = new Categoria(id, null);
		
		// convertendo lista de producaoFilme em lista de producaoFilmeDto
		lista = service.findByCategoriaId(cat).stream()
				.map(f -> new ProducaoFilmeDto(f))
				.collect(Collectors.toList());
		
		return ResponseEntity.ok().body(lista);
		
	}
}

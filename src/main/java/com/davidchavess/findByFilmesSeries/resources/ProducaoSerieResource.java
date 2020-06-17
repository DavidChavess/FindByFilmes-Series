package com.davidchavess.findByFilmesSeries.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davidchavess.findByFilmesSeries.dto.ProducaoSerieDto;
import com.davidchavess.findByFilmesSeries.services.ProducaoSerieService;

@RestController
@RequestMapping(value = "/series")
public class ProducaoSerieResource {
	
	@Autowired
	private ProducaoSerieService service;
	
	@GetMapping
	public ResponseEntity<List<ProducaoSerieDto>> findAll(){
		List<ProducaoSerieDto> lista;
		
		// convertendo lista de producaoSerie em lista de producaoSerieeDto
		lista = service.findAll().stream()
		.map( p -> new ProducaoSerieDto(p))
		.collect(Collectors.toList());
		
		return ResponseEntity.ok().body(lista);

	}

}

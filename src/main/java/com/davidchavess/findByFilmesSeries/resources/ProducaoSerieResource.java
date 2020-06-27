package com.davidchavess.findByFilmesSeries.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.davidchavess.findByFilmesSeries.dto.ProducaoSerieDto;
import com.davidchavess.findByFilmesSeries.dto.ProducaoSerieNewDto;
import com.davidchavess.findByFilmesSeries.entidades.ProducaoSerie;
import com.davidchavess.findByFilmesSeries.services.ProducaoSerieService;

@RestController
@RequestMapping(value = "/series")
public class ProducaoSerieResource{
	
	@Autowired
	private ProducaoSerieService service;
	
	@GetMapping
	public ResponseEntity<List<ProducaoSerieDto>> findAll(){
		
		List<ProducaoSerieDto> lista = service.findAll().stream()
		.map( p ->  new ProducaoSerieDto(p))
		.collect(Collectors.toList());
		
		return ResponseEntity.ok().body(lista);

	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ProducaoSerieDto> findById(@PathVariable Long id){
		ProducaoSerie p = (ProducaoSerie) service.findById(id);
		ProducaoSerieDto pDto = new ProducaoSerieDto(p);
		return ResponseEntity.ok().body(pDto);	
	}
	
	@PostMapping
	public ResponseEntity<ProducaoSerieDto> insert(@RequestBody ProducaoSerieNewDto obj){		
		ProducaoSerie p = service.fromDto(obj); 
		p = (ProducaoSerie) service.insert(p);	
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(p.getId()).toUri();
		ProducaoSerieDto pDto = new ProducaoSerieDto(p);
		return ResponseEntity.created(uri).body(pDto);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<ProducaoSerieDto> update(@PathVariable Long id, @RequestBody ProducaoSerieNewDto obj){
		ProducaoSerie p = service.fromDto(obj); 
		p = service.update(id, p);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(p.getId()).toUri();
		ProducaoSerieDto pDto = new ProducaoSerieDto(p);
		return ResponseEntity.created(uri).body(pDto);
	}
	

}

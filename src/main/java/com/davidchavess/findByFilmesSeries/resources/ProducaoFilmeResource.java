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

import com.davidchavess.findByFilmesSeries.dto.ProducaoFilmeDto;
import com.davidchavess.findByFilmesSeries.dto.ProducaoFilmeNewDto;
import com.davidchavess.findByFilmesSeries.entidades.ProducaoFilme;
import com.davidchavess.findByFilmesSeries.services.ProducaoFilmeService;

@RestController
@RequestMapping(value = "/filmes")
public class ProducaoFilmeResource{
	
	@Autowired
	private ProducaoFilmeService service;
	
	@GetMapping
	public ResponseEntity<List<ProducaoFilmeDto>> findAll(){		
		List<ProducaoFilmeDto> lista = service.findAll().stream()
		.map( p ->  new ProducaoFilmeDto(p))
		.collect(Collectors.toList());
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ProducaoFilmeDto> findById(@PathVariable Long id){
		ProducaoFilme p = (ProducaoFilme) service.findById(id);
		ProducaoFilmeDto pDto = new ProducaoFilmeDto(p);
		return ResponseEntity.ok().body(pDto);	
	}
	
	@PostMapping
	public ResponseEntity<ProducaoFilmeDto> insert(@RequestBody ProducaoFilmeNewDto obj){		
		ProducaoFilme p = service.fromDto(obj); 
		p = (ProducaoFilme) service.insert(p);	
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(p.getId()).toUri();
		ProducaoFilmeDto pDto = new ProducaoFilmeDto(p);
		return ResponseEntity.created(uri).body(pDto);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<ProducaoFilmeDto> update(@PathVariable Long id, @RequestBody ProducaoFilmeNewDto obj){
		ProducaoFilme p = service.fromDto(obj); 
		p = service.update(id, p);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(p.getId()).toUri();
		ProducaoFilmeDto pDto = new ProducaoFilmeDto(p);
		return ResponseEntity.created(uri).body(pDto);
	}
}

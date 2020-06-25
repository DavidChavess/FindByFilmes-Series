package com.davidchavess.findByFilmesSeries.resources;

import java.util.List;

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

import com.davidchavess.findByFilmesSeries.dto.AvaliacaoNewDto;
import com.davidchavess.findByFilmesSeries.entidades.Avaliacao;
import com.davidchavess.findByFilmesSeries.services.AvaliacaoService;

@RestController
@RequestMapping(value = "/avaliacoes")
public class AvaliacaoResource {
	
	@Autowired
	private AvaliacaoService service;
	
	@GetMapping
	public ResponseEntity<List<Avaliacao>> findAll(){	
		return ResponseEntity.ok().body(service.findAll());
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Avaliacao> findById( @PathVariable Long id){
		return ResponseEntity.ok().body(service.findById(id));
		
	}

	@PostMapping
	public ResponseEntity<Avaliacao> insert(@RequestBody AvaliacaoNewDto avl){
		Avaliacao a = service.fromDto(avl);
		return ResponseEntity.ok().body(service.insert(a));
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Avaliacao> update(@PathVariable Long id, @RequestBody Avaliacao avl){
		return ResponseEntity.ok().body(service.update(id, avl));
	}
	
}

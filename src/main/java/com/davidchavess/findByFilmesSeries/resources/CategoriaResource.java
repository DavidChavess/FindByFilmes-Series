package com.davidchavess.findByFilmesSeries.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davidchavess.findByFilmesSeries.entidades.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	
	@GetMapping
	public ResponseEntity<List<Categoria>> findAll(){
		
		List<Categoria> list = new ArrayList<>();
		
		Categoria c1 = new Categoria(null, "Terror");
		Categoria c2 = new Categoria(null, "Acão");
		Categoria c3 = new Categoria(null, "Suspense");
		
		list.addAll(Arrays.asList(c1,c2,c3));
		
		return ResponseEntity.ok().body(list);
	}

}

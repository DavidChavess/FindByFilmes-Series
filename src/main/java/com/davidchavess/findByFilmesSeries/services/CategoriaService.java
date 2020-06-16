package com.davidchavess.findByFilmesSeries.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidchavess.findByFilmesSeries.entidades.Categoria;
import com.davidchavess.findByFilmesSeries.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;
	
	public List<Categoria> findAll(){
		return repository.findAll();
	}
	
	public Categoria findById(Long id) {
		Optional<Categoria> cat;
		
		cat = repository.findById(id);
		return cat.orElseThrow(() -> new RuntimeException());
	}
}

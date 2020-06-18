package com.davidchavess.findByFilmesSeries.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidchavess.findByFilmesSeries.entidades.Categoria;
import com.davidchavess.findByFilmesSeries.entidades.ProducaoFilme;
import com.davidchavess.findByFilmesSeries.repositories.ProducaoFilmeRepository;

@Service
public class ProducaoFilmeService {

	@Autowired
	private ProducaoFilmeRepository repository;
	
	public List<ProducaoFilme> findAll(){
		return repository.findAll();
	}
	
	public ProducaoFilme findById(Long id) {
		Optional<ProducaoFilme> cat;
		
		cat = repository.findById(id);
		return cat.orElseThrow(() -> new RuntimeException());
	}
	
	public List<ProducaoFilme> findByCategoriaId(Categoria categoria){
		return
		repository.findAll().stream().filter( f -> f.getCategoria().equals(categoria))
		.collect(Collectors.toList());
	}
}

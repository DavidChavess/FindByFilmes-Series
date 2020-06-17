package com.davidchavess.findByFilmesSeries.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidchavess.findByFilmesSeries.entidades.ProducaoSerie;
import com.davidchavess.findByFilmesSeries.repositories.ProducaoSerieRepository;

@Service
public class ProducaoSerieService {

	@Autowired
	private ProducaoSerieRepository repository;
	
	public List<ProducaoSerie> findAll(){
		return repository.findAll();
	}
	
	public ProducaoSerie findById(Long id) {
		Optional<ProducaoSerie> cat;
		
		cat = repository.findById(id);
		return cat.orElseThrow(() -> new RuntimeException());
	}
}

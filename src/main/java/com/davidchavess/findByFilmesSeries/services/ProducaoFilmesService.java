package com.davidchavess.findByFilmesSeries.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidchavess.findByFilmesSeries.entidades.Producao;
import com.davidchavess.findByFilmesSeries.entidades.ProducaoFilme;
import com.davidchavess.findByFilmesSeries.repositories.ProducaoRepository;

@Service
public class ProducaoFilmesService {

	@Autowired
	private ProducaoRepository repo;
	
	public List<Producao> findAll(){
		return	repo.findAll();
	}
}

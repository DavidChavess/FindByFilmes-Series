package com.davidchavess.findByFilmesSeries.services;

import java.util.List;

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
}

package com.davidchavess.findByFilmesSeries.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davidchavess.findByFilmesSeries.entidades.Producao;
import com.davidchavess.findByFilmesSeries.entidades.ProducaoFilme;
import com.davidchavess.findByFilmesSeries.services.ProducaoFilmesService;

@RestController
@RequestMapping(value = "/filmes")
public class ProcucaoResource {
	
	@Autowired
	private ProducaoFilmesService service;
	
	@GetMapping
	public List<Producao> findAll(){
		return service.findAll();
	}

}

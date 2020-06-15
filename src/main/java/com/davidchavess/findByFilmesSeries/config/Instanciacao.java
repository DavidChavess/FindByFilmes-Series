package com.davidchavess.findByFilmesSeries.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.davidchavess.findByFilmesSeries.entidades.Categoria;
import com.davidchavess.findByFilmesSeries.repositories.CategoriaRepository;

@Configuration
@Profile("test")
public class Instanciacao implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository repository;

	@Override
	public void run(String... args) throws Exception {
			
		List<Categoria> categorias = Arrays.asList(
				new Categoria(null, "Terror"),
				new Categoria(null, "Ação"),
				new Categoria(null, "Aventura")
		);  
		
		repository.saveAll(categorias);
	}

}

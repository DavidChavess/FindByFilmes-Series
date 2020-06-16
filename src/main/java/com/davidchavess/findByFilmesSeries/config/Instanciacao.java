package com.davidchavess.findByFilmesSeries.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.davidchavess.findByFilmesSeries.entidades.Categoria;
import com.davidchavess.findByFilmesSeries.entidades.Producao;
import com.davidchavess.findByFilmesSeries.entidades.ProducaoFilme;
import com.davidchavess.findByFilmesSeries.entidades.ProducaoSerie;
import com.davidchavess.findByFilmesSeries.repositories.CategoriaRepository;
import com.davidchavess.findByFilmesSeries.repositories.ProducaoRepository;

@Configuration
@Profile("test")
public class Instanciacao implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProducaoRepository producaoRepository;

	@Override
	public void run(String... args) throws Exception {
			
		Categoria c1, c2, c3;
				
		c1 = new Categoria(null, "Ação");
		c2 = new Categoria(null, "Fantasia");
		c3 = new Categoria(null, "Terror");
		
		Producao f1,f2,f3, s1;
		
		f1 = new ProducaoFilme(null, "Vingadores: Guerra Infinita", 2018, 150, c1, false);
		c1.getProducoes().add(f1);
				
		f2 = new ProducaoFilme(null, "John Wick: Parabelum", 2019, 124, c1, false);
		c1.getProducoes().add(f2);
		
		f3 = new ProducaoFilme(null, "Harry Potter", 2004, 140, c2, false);	
		c2.getProducoes().add(f3);
		
		s1 = new ProducaoSerie(null, "Sobrenatural", 2004, 140, c3, null, 15, 23);	
		c3.getProducoes().add(s1);
		
		
		categoriaRepository.saveAll(Arrays.asList(c1,c2, c3));
		producaoRepository.saveAll(Arrays.asList(f1,f2,f3, s1));
		
	

		
/*
		categorias.get(1).getProducoes().addAll(Arrays.asList(producoes.get(0), producoes.get(1)));
		categorias.get(3).getProducoes().add(producoes.get(2));
		
		categoriaRepository.saveAll(categorias);
	*/	
		
	}

}

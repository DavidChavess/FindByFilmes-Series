package com.davidchavess.findByFilmesSeries.entidades;

import javax.persistence.Entity;

@Entity
public class ProducaoFilme extends Producao {

	private static final long serialVersionUID = 1L;
	
	public ProducaoFilme() {
		
	}
	
	public ProducaoFilme(Long id, String titulo, Integer anoLancamento, Integer duracao, Categoria categoria, String caminhoImg) {	
		super(id, titulo, anoLancamento, duracao, categoria, caminhoImg);
	}
	
}

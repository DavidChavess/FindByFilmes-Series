package com.davidchavess.findByFilmesSeries.entidades;

import javax.persistence.Entity;

@Entity
public class ProducaoFilme extends Producao {

	private static final long serialVersionUID = 1L;
	private Boolean isCinema;

	public ProducaoFilme() {
	
	}

	public ProducaoFilme(Long id, String titulo, Integer anoLancamento, Integer duracao, 
		Categoria categoria,String descricao, String caminhoImg, Boolean isCinema) {
			
		super(id, titulo, anoLancamento, duracao, categoria, descricao, caminhoImg);
	}

	public Boolean getIsCinema() {
		return isCinema;
	}

	public void setIsCinema(Boolean isCinema) {
		this.isCinema = isCinema;
	}
	
	
}

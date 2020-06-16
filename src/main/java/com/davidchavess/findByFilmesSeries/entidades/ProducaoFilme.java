package com.davidchavess.findByFilmesSeries.entidades;

import javax.persistence.Entity;

@Entity
public class ProducaoFilme extends Producao {

	private static final long serialVersionUID = 1L;
	private Boolean isCinema;

	public ProducaoFilme() {
	
	}

	public ProducaoFilme(Integer id_producao, String titulo, Integer anoLancamento, Integer duracao,
			Categoria categoria, Boolean isCinema) {
		super(id_producao, titulo, anoLancamento, duracao, categoria);
		this.isCinema = isCinema;
	}


	public Boolean getIsCinema() {
		return isCinema;
	}

	public void setIsCinema(Boolean isCinema) {
		this.isCinema = isCinema;
	}
	
	
	
}

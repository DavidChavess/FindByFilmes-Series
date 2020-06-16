package com.davidchavess.findByFilmesSeries.entidades;

import javax.persistence.Entity;

@Entity
public class ProducaoSerie extends Producao{

	private static final long serialVersionUID = 1L;
	
	private String subTitulo;
	private Integer numeroTemporadas;
	private Integer numeroMedioEpisodio;
	
	public ProducaoSerie() {
		
	}


	public ProducaoSerie(Integer id_producao, String titulo, Integer anoLancamento, Integer duracao,
			Categoria categoria, String subTitulo, Integer numeroTemporadas, Integer numeroMedioEpisodio) {
		super(id_producao, titulo, anoLancamento, duracao, categoria);
		this.subTitulo = subTitulo;
		this.numeroTemporadas = numeroTemporadas;
		this.numeroMedioEpisodio = numeroMedioEpisodio;
	}


	public Integer getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(Integer numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public Integer getNumeroMedioEpisodio() {
		return numeroMedioEpisodio;
	}

	public void setNumeroMedioEpisodio(Integer numeroMedioEpisodio) {
		this.numeroMedioEpisodio = numeroMedioEpisodio;
	}

	public String getSubTitulo() {
		return subTitulo;
	}

	public void setSubTitulo(String subTitulo) {
		this.subTitulo = subTitulo;
	}

}

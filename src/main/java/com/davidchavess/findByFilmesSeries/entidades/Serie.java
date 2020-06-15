package com.davidchavess.findByFilmesSeries.entidades;

import java.time.Instant;

public class Serie extends Producao{

	private static final long serialVersionUID = 1L;
	private Integer numeroTemporadas;
	private Integer numeroMedioEpisodio;
	
	public Serie() {
		
	}

	public Serie(String titulo, Instant anoLancamento, Integer duracao, Categoria categoria, Integer numeroTemporadas,
			Integer numeroMedioEpisodio) {
		super(titulo, anoLancamento, duracao, categoria);
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

}

package com.davidchavess.findByFilmesSeries.dto;

import com.davidchavess.findByFilmesSeries.entidades.Producao;
import com.davidchavess.findByFilmesSeries.entidades.ProducaoSerie;

public class ProducaoSerieDto extends Producao {

	private static final long serialVersionUID = 1L;
	
	private Integer numeroTemporadas;
	private Integer episodiosPorTemporada;

	public ProducaoSerieDto(){}	
	
	public ProducaoSerieDto(ProducaoSerie p) {
		super(
			p.getId(), 
			p.getTitulo(),
			p.getAnoLancamento(),
			p.getDuracao(), 
			p.getCategoria(),
			p.getDescricao(), 
			p.getCaminhoImg()
		);
		
		this.getAvaliacoes().addAll(p.getAvaliacoes());
		
		this.numeroTemporadas = p.getNumeroTemporadas();
		this.episodiosPorTemporada = p.getEpisodiosPorTemporada();
		
	}

	public Integer getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(Integer numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public Integer getEpisodiosPorTemporada() {
		return episodiosPorTemporada;
	}

	public void setEpisodiosPorTemporada(Integer episodiosPorTemporada) {
		this.episodiosPorTemporada = episodiosPorTemporada;
	}
	

}

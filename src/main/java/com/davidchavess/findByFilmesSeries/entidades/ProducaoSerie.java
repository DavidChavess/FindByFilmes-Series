package com.davidchavess.findByFilmesSeries.entidades;

import javax.persistence.Entity;

@Entity
public class ProducaoSerie extends Producao{

	private static final long serialVersionUID = 1L;
	
	private Integer numeroTemporadas;
	private Integer episodiosPorTemporada;
	
	public ProducaoSerie() {
		
	}

	public ProducaoSerie(Long id,String titulo, Integer anoLancamento, Integer duracao, Categoria categoria,String descricao,
		String caminhoImg, String subTitulo, Integer numeroTemporadas,Integer episodiosPorTemporada){
		
		super(id, titulo, anoLancamento, duracao, categoria, descricao, caminhoImg);
		this.numeroTemporadas = numeroTemporadas;
		this.episodiosPorTemporada = episodiosPorTemporada;
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

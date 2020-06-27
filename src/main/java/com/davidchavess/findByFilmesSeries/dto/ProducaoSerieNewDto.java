package com.davidchavess.findByFilmesSeries.dto;

import java.io.Serializable;

public class ProducaoSerieNewDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String  titulo;
	private Integer anoLancamento;
	private Long categoriaId;
	private Integer duracao;
	private String caminhoImg;
	private Integer numeroTemporadas;
	private Integer episodiosPorTemporada;


	public ProducaoSerieNewDto(){}	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(Integer anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public Long getCategoriaId() {
		return categoriaId;
	}

	public void setCategoria(Long categoriaId) {
		this.categoriaId = categoriaId;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	public String getCaminhoImg() {
		return caminhoImg;
	}

	public void setCaminhoImg(String caminhoImg) {
		this.caminhoImg = caminhoImg;
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

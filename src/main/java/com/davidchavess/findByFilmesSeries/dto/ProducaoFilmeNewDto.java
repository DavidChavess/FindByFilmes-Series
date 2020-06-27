package com.davidchavess.findByFilmesSeries.dto;

import java.io.Serializable;

public class ProducaoFilmeNewDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String  titulo;
	private Integer anoLancamento;
	private Long categoriaId;
	private Integer duracao;
	private String caminhoImg;
	

	public ProducaoFilmeNewDto(){}	
	
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

}

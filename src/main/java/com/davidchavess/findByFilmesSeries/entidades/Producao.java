package com.davidchavess.findByFilmesSeries.entidades;

import java.io.Serializable;
import java.time.Instant;

public class Producao implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String titulo;
	private Instant anoLancamento;
	private Integer duracao;
	private Categoria categoria;
	
	public Producao() {
		
	}
	
	public Producao(String titulo, Instant anoLancamento, Integer duracao, Categoria categoria) {
		this.titulo = titulo;
		this.anoLancamento = anoLancamento;
		this.duracao = duracao;
		this.categoria = categoria;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Instant getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(Instant anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
		
}

package com.davidchavess.findByFilmesSeries.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Avaliacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Float nota;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "producao_id")
	private Producao producao;
	
	public Avaliacao() {
		
	}
	
	public Avaliacao(Long id, Producao producao, Usuario usuario, Float nota) {
		super();
		this.id = id;
		this.nota = nota;
		this.usuario = usuario;
		this.producao = producao;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Float getNota() {
		return nota;
	}
	public void setNota(Float nota) {
		this.nota = nota;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Producao getProducao() {
		return producao;
	}
	public void setProducao(Producao producao) {
		this.producao = producao;
	}

}

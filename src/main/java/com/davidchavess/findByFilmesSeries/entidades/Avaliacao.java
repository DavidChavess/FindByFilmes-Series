package com.davidchavess.findByFilmesSeries.entidades;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Avaliacao {

	@EmbeddedId
	private AvaliacaoItemPK id = new AvaliacaoItemPK();
	private Float nota;
	
	public Avaliacao() {}
	
	public Avaliacao(Producao p, Usuario u, Float nota) {
		this.nota = nota;
		id.setProducao(p);
		id.setUsuario(u);
	}

	public Float getNota() {
		return nota;
	}

	public void setNota(Float nota) {
		this.nota = nota;
	}

	public Producao getProducao() {
		return id.getProducao();
	}
	public void setProducao(Producao producao) {
		id.setProducao(producao);
	}
	public Usuario getUsuario() {
		return id.getUsuario();
	}
	public void setUsuario(Usuario usuario) {
		id.setUsuario(usuario);
	}
}

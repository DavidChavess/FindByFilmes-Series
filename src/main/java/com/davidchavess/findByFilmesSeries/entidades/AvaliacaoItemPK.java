package com.davidchavess.findByFilmesSeries.entidades;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class AvaliacaoItemPK  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	

	@ManyToOne
	@JoinColumn(name = "producao_id")
	private Producao producao;

	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	
	public Producao getProducao() {
		return producao;
	}
	public void setProducao(Producao producao) {
		this.producao = producao;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}

package com.davidchavess.findByFilmesSeries.dto;

import java.io.Serializable;

public class AvaliacaoNewDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Float nota;
	private Long usuarioId;
	private Long producaoId;
	
	public AvaliacaoNewDto() {
		
	}

	public Float getNota() {
		return nota;
	}

	public void setNota(Float nota) {
		this.nota = nota;
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public Long getProducaoId() {
		return producaoId;
	}

	public void setProducaoId(Long producaoId) {
		this.producaoId = producaoId;
	}
		
}

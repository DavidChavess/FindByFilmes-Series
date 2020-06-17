package com.davidchavess.findByFilmesSeries.dto;

import com.davidchavess.findByFilmesSeries.entidades.Producao;
import com.davidchavess.findByFilmesSeries.entidades.ProducaoFilme;

public class ProducaoFilmeDto extends Producao {

	private static final long serialVersionUID = 1L;
	
	
	public ProducaoFilmeDto() {}

	
	public ProducaoFilmeDto(ProducaoFilme p) {
		
		super(
			p.getId(), 
			p.getTitulo(),
			p.getAnoLancamento(),
			p.getDuracao(), 
			p.getCategoria(),
			p.getDescricao(), 
			p.getCaminhoImg()
		);
			
	}

}

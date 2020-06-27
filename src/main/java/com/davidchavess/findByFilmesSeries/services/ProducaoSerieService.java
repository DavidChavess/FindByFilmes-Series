package com.davidchavess.findByFilmesSeries.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidchavess.findByFilmesSeries.dto.ProducaoSerieNewDto;
import com.davidchavess.findByFilmesSeries.entidades.Categoria;
import com.davidchavess.findByFilmesSeries.entidades.ProducaoSerie;
import com.davidchavess.findByFilmesSeries.repositories.ProducaoSerieRepository;

@Service
public class ProducaoSerieService extends ProducaoService {

	@Autowired
	private ProducaoSerieRepository repository;
	
	public List<ProducaoSerie> findAll(){
		return repository.findAll();
	}
		
	public ProducaoSerie update(Long id, ProducaoSerie newObj) {
		ProducaoSerie oldObj = (ProducaoSerie) findById(id);
		updateData(newObj, oldObj);
		oldObj.setNumeroTemporadas(newObj.getNumeroTemporadas());
		oldObj.setEpisodiosPorTemporada(newObj.getEpisodiosPorTemporada());
		return (ProducaoSerie) insert(oldObj);
	}
	
	public ProducaoSerie fromDto(ProducaoSerieNewDto obj) {
		
		Categoria c = new Categoria(obj.getCategoriaId(), null);
		
		ProducaoSerie p = new ProducaoSerie(null, obj.getTitulo(), obj.getAnoLancamento()
			,obj.getDuracao(), c, obj.getCaminhoImg(), obj.getNumeroTemporadas()
			, obj.getEpisodiosPorTemporada());
		
		return p;	
	}
}

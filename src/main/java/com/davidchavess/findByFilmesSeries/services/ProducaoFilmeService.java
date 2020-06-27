package com.davidchavess.findByFilmesSeries.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidchavess.findByFilmesSeries.dto.ProducaoFilmeNewDto;
import com.davidchavess.findByFilmesSeries.entidades.Categoria;
import com.davidchavess.findByFilmesSeries.entidades.ProducaoFilme;
import com.davidchavess.findByFilmesSeries.repositories.ProducaoFilmeRepository;

@Service
public class ProducaoFilmeService extends ProducaoService {

	@Autowired
	private ProducaoFilmeRepository repository;
	
	public List<ProducaoFilme> findAll(){
		return repository.findAll();
	}
			
	public ProducaoFilme update(Long id, ProducaoFilme newObj) {
		ProducaoFilme oldObj = (ProducaoFilme) findById(id);
		updateData(newObj, oldObj);
		return (ProducaoFilme) insert(oldObj);
	}
	
	public ProducaoFilme fromDto(ProducaoFilmeNewDto obj) {
		Categoria c = new Categoria(obj.getCategoriaId(), null);
		ProducaoFilme p = new ProducaoFilme(null, obj.getTitulo(), obj.getAnoLancamento(),obj.getDuracao(), c, obj.getCaminhoImg());
		return p;	
	}
}
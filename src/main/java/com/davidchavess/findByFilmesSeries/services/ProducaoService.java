package com.davidchavess.findByFilmesSeries.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidchavess.findByFilmesSeries.entidades.Producao;
import com.davidchavess.findByFilmesSeries.repositories.ProducaoRepository;

@Service
public class ProducaoService {

	@Autowired
	private ProducaoRepository repository;
	
	public Producao findById(Long id) {
		Optional<Producao> obj = repository.findById(id);
		return obj.orElseThrow(() -> new RuntimeException());
	}
	
	public Producao insert(Producao obj){
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	protected void updateData(Producao newObj, Producao oldObj) {
		oldObj.setTitulo(newObj.getTitulo());
		oldObj.setDuracao(newObj.getDuracao());
		oldObj.setAnoLancamento(newObj.getAnoLancamento());
		oldObj.setCaminhoImg(newObj.getCaminhoImg());
		oldObj.setCategoria(newObj.getCategoria());
	}
}

package com.davidchavess.findByFilmesSeries.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidchavess.findByFilmesSeries.entidades.Avaliacao;
import com.davidchavess.findByFilmesSeries.repositories.AvaliacaoRepository;

@Service
public class AvaliacaoService {

	@Autowired
	private AvaliacaoRepository repository;
	
	public List<Avaliacao> findAll(){
		return repository.findAll();
	}
	
	public Avaliacao findById(Long id) {
		Optional<Avaliacao> av = repository.findById(id);
		return av.orElseThrow(() -> new RuntimeException());
	}
	
	public Avaliacao insert(Avaliacao a) {
		return repository.save(a);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public Avaliacao update(Long id, Avaliacao novaAvaliacao) {
		Avaliacao avlAntiga = findById(id);
		updateAvaliacao(avlAntiga, novaAvaliacao);
		avlAntiga = insert(avlAntiga);
		return avlAntiga;
	}

	private void updateAvaliacao(Avaliacao avlAntiga, Avaliacao novaAvaliacao) {
		avlAntiga.setNota(novaAvaliacao.getNota());
	}

}
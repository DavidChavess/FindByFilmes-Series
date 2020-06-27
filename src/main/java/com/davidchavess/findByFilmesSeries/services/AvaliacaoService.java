package com.davidchavess.findByFilmesSeries.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidchavess.findByFilmesSeries.dto.AvaliacaoNewDto;
import com.davidchavess.findByFilmesSeries.entidades.Avaliacao;
import com.davidchavess.findByFilmesSeries.entidades.Producao;
import com.davidchavess.findByFilmesSeries.entidades.Usuario;
import com.davidchavess.findByFilmesSeries.repositories.AvaliacaoRepository;

@Service
public class AvaliacaoService {

	@Autowired
	private AvaliacaoRepository repository;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private ProducaoService producaoService;
	
	public List<Avaliacao> findAll(){
		return repository.findAll();
	}
	
	public Avaliacao findById(Long id) {
		Optional<Avaliacao> av = repository.findById(id);
		return av.orElseThrow(() -> new RuntimeException());
	}
	
	public Avaliacao insert(Avaliacao a) {
		a = repository.save(a);		
		usuarioService.insert(a.getUsuario());
		producaoService.insert(a.getProducao());
		return a; 
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public Avaliacao update(Long id, Avaliacao novaAvaliacao) {
		Avaliacao avlAntiga = findById(id);
		avlAntiga.setNota(novaAvaliacao.getNota());
		avlAntiga = insert(avlAntiga);
		return avlAntiga;
	}

	
	public Avaliacao fromDto(AvaliacaoNewDto avl) {
		
		Usuario u = usuarioService.findById(avl.getUsuarioId());		
		Producao p = producaoService.findById(avl.getProducaoId());
		
		Avaliacao a = new Avaliacao(null, p, u, avl.getNota());
		
		u.getAvaliacoes().add(a);
		p.getAvaliacoes().add(a);
		return a;
	}
	

}
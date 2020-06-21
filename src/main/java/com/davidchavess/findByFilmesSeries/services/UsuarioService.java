package com.davidchavess.findByFilmesSeries.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidchavess.findByFilmesSeries.entidades.Usuario;
import com.davidchavess.findByFilmesSeries.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	public List<Usuario> findAll(){
		return repository.findAll();
	}
	
	public Usuario findById(Long id) {
		Optional<Usuario> u = repository.findById(id);
		return u.orElseThrow(() -> new RuntimeException());
	}
	
	public Usuario insert(Usuario u) {
		return repository.save(u);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public Usuario update(Long id, Usuario uNovo) {
		Usuario uAntigo = findById(id);
		updateUsuario(uAntigo,uNovo);
		return insert(uAntigo);
	}

	private void updateUsuario(Usuario uAntigo, Usuario uNovo) {
		uAntigo.setNomeUsuario(uNovo.getNomeUsuario());
		uAntigo.setCidade(uNovo.getCidade());
		uAntigo.setTelefone(uNovo.getTelefone());		
	}
}

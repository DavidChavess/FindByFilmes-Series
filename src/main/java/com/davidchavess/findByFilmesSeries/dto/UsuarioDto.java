package com.davidchavess.findByFilmesSeries.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.davidchavess.findByFilmesSeries.entidades.Avaliacao;
import com.davidchavess.findByFilmesSeries.entidades.Usuario;

public class UsuarioDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nomeUsuario;
	private String telefone;
	private String cidade;
	
	private List<Avaliacao> filmesAvaliados = new ArrayList<>();
	
	public UsuarioDto() {}

	
	public UsuarioDto(Usuario u) {	
		id = u.getId(); 
		nomeUsuario = u.getNome();
		telefone = u.getTelefone();
		cidade = u.getCidade();
		filmesAvaliados.addAll(u.getFilmesAvaliados());
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNomeUsuario() {
		return nomeUsuario;
	}


	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public List<Avaliacao> getFilmesAvaliados() {
		return filmesAvaliados;
	}


}

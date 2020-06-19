package com.davidchavess.findByFilmesSeries.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeUsuario;
	private String senha;
	private String telefone;
	private String cidade;
	
	@OneToMany(mappedBy = "id.usuario")
	private List<Avaliacao> avaliacoes = new ArrayList<>();
	
	
	public Usuario() {}

	public Usuario(Long id, String nomeUsuario, String senha, String telefone, String cidade) {
		this.id = id;
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
		this.telefone = telefone;
		this.cidade = cidade;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nomeUsuario;
	}

	public void setNome(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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

	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(List<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}
		
}

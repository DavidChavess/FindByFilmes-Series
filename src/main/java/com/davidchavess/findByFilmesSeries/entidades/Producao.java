package com.davidchavess.findByFilmesSeries.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Producao implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name = "idProducao")
	private Long id;
	
	private String  titulo;
	private Integer anoLancamento;
	private Integer duracao;
	private String descricao;
	private String caminhoImg;
	
	@ManyToOne
	@JoinColumn( name = "categoria_id")
	private Categoria categoria;
	

	@OneToMany(mappedBy = "id.producao")
	private List<Avaliacao> avaliacoes = new ArrayList<>();
	
	public Producao() {
		
	}
	
	public Producao(Long id, String titulo, Integer anoLancamento, Integer duracao, Categoria categoria
			, String descricao, String caminhoImg ) {
		this.id = id;
		this.titulo = titulo;
		this.anoLancamento = anoLancamento;
		this.duracao = duracao;
		this.categoria = categoria;
		this.descricao = descricao;
		this.caminhoImg = caminhoImg;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(Integer anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCaminhoImg() {
		return caminhoImg;
	}

	public void setCaminhoImg(String caminhoImg) {
		this.caminhoImg = caminhoImg;
	}
	
	public List<Avaliacao> gAvaliacoes(){
		return avaliacoes;
	}

	public Float getNotaMedia() {
		return 
		avaliacoes.stream()
		.map(a -> a.getNota())
		.reduce( 0.0f, (n1,n2) -> n1+n2) / avaliacoes.size();
	}

}

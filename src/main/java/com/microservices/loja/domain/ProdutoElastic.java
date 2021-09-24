package com.microservices.loja.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "produtoeslatic")
public class ProdutoElastic {

	@Id
	private Integer id;
	private String descricao;
	private String nome;
	
	public ProdutoElastic(Integer id, String descricao, String nome) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.nome = nome;
	}
	
	public ProdutoElastic() {}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}

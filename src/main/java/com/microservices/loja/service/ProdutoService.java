package com.microservices.loja.service;

import java.util.List;

import com.microservices.loja.dto.ProdutoDTO;

public interface ProdutoService {
	ProdutoDTO cadastrarProduto(ProdutoDTO produtoDTO);
	List<ProdutoDTO> listarTodos();
	void cadastrarProdutoElastic(ProdutoDTO produtoDTO);
}

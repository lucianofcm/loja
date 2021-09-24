package com.microservices.loja.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.loja.domain.ProdutoElastic;
import com.microservices.loja.dto.ProdutoDTO;
import com.microservices.loja.repository.ProdutoElasticRepo;

@RestController
@RequestMapping("/produtosElastic")
public class ProdutoElasticController {

	final ProdutoElasticRepo produtoRepo;

	
	public ProdutoElasticController(ProdutoElasticRepo produtoRepo) {
		this.produtoRepo = produtoRepo;
	}

	
	@PostMapping
	@ResponseBody
	public ResponseEntity<Void> cadastrarProduto(@RequestBody ProdutoDTO produto) {
		produtoRepo.save(new ProdutoElastic(null, produto.getDescricao(), produto.getNome()));
		return new ResponseEntity<>(HttpStatus.OK);
	}
}

package com.microservices.loja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.loja.domain.Produto;
import com.microservices.loja.dto.ProdutoDTO;
import com.microservices.loja.repository.ProdutoRepo;
import com.microservices.loja.service.FornecedorService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	ProdutoRepo produtoRepo;
	FornecedorService fornecedorService;

	@Autowired
	public ProdutoController(ProdutoRepo produtoRepo, FornecedorService fornecedorSergice) {
		this.produtoRepo = produtoRepo;
		this.fornecedorService = fornecedorSergice;
	}

	@GetMapping
	public ResponseEntity<List<Produto>> listarProdutos() {
		return new ResponseEntity<>(produtoRepo.findAll(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/fornecedor")
	public ResponseEntity<List<ProdutoDTO>> listarProdutosFornecedor() {
		return new ResponseEntity<List<ProdutoDTO>>(fornecedorService.listarProdutosFornecedor().getBody(), HttpStatus.OK);
	}
}

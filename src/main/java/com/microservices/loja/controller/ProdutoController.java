package com.microservices.loja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.loja.dto.ProdutoDTO;
import com.microservices.loja.service.FornecedorService;
import com.microservices.loja.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	final ProdutoService produtoService;
	final FornecedorService fornecedorService;

	@Autowired
	public ProdutoController(ProdutoService produtoService, FornecedorService fornecedorSergice) {
		this.produtoService = produtoService;
		this.fornecedorService = fornecedorSergice;
	}

	@GetMapping
	public ResponseEntity<List<ProdutoDTO>> listarProdutos() {
		return new ResponseEntity<>(produtoService.listarTodos(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/fornecedor")
	public ResponseEntity<List<ProdutoDTO>> listarProdutosFornecedor() {
		return new ResponseEntity<List<ProdutoDTO>>(fornecedorService.listarProdutosFornecedor().getBody(), HttpStatus.OK);
	}
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<ProdutoDTO> cadastrarProduto(@RequestBody ProdutoDTO produto) {
		return new ResponseEntity<ProdutoDTO>(produtoService.cadastrarProduto(produto), HttpStatus.OK);
	}
}

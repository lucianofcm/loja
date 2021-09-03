package com.microservices.loja.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.loja.domain.Produto;
import com.microservices.loja.dto.CompraDTO;
import com.microservices.loja.repository.ProdutoRepo;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	ProdutoRepo produtoRepo;

	public ProdutoController(ProdutoRepo produtoRepo) {
		this.produtoRepo = produtoRepo;
	}

	@GetMapping
	public ResponseEntity<List<Produto>> listarProdutos(@RequestBody CompraDTO compra) {
		return new ResponseEntity<>(produtoRepo.findAll(), HttpStatus.OK);
	}
}

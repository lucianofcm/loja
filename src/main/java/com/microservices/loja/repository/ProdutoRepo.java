package com.microservices.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.loja.domain.Produto;

public interface ProdutoRepo extends JpaRepository<Produto, Integer> {

}
	
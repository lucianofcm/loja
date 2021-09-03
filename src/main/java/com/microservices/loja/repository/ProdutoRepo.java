package com.microservices.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.loja.domain.Produto;

@Repository
public interface ProdutoRepo extends JpaRepository<Produto, Integer> {

}

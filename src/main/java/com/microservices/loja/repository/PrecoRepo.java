package com.microservices.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.loja.domain.Preco;

public interface PrecoRepo extends JpaRepository<Preco, Integer> {

}
	
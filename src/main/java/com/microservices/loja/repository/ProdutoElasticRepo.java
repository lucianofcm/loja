package com.microservices.loja.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.microservices.loja.domain.ProdutoElastic;

public interface ProdutoElasticRepo extends ElasticsearchRepository<ProdutoElastic, Integer> {

}
	
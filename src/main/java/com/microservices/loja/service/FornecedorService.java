package com.microservices.loja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservices.loja.dto.ProdutoDTO;


@Service
public class FornecedorService {

	@Value("${fornecedor.url}")
	private String url;
	private RestTemplate restTemplate;

	@Autowired
	public FornecedorService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public ResponseEntity<List<ProdutoDTO>> listarProdutosFornecedor() {
		return restTemplate.exchange("http://fornecedor/produtos/", HttpMethod.GET, null,
				new ParameterizedTypeReference<List<ProdutoDTO>>() {
				});
	}

}

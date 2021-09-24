package com.microservices.loja.service;

import java.util.List;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import com.microservices.loja.domain.Preco;
import com.microservices.loja.domain.Produto;
import com.microservices.loja.dto.ProdutoDTO;
import com.microservices.loja.repository.ProdutoRepo;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	private ProdutoRepo produtoRepo;
	private ModelMapper modelMapper;

	public ProdutoServiceImpl(ProdutoRepo produtoRepo, ModelMapper modelMapper) {
		this.produtoRepo = produtoRepo;
		this.modelMapper = modelMapper;
	}

	@Override
	public ProdutoDTO cadastrarProduto(ProdutoDTO produtoDTO) {
		Produto produto = produtoRepo.save(Produto.builder().nome(produtoDTO.getNome())
				.descricao(produtoDTO.getDescricao())
				.precos(Set.of(Preco.builder().valorProduto(produtoDTO.getPreco().getValorProduto()).build())).build());

		return modelMapper.map(produto, ProdutoDTO.class);
	}

	@Override
	public List<ProdutoDTO> listarTodos() {
		return modelMapper.map(produtoRepo.findAll(), new TypeToken<List<ProdutoDTO>>() {
		}.getType());
	}

	@Override
	public void cadastrarProdutoElastic(ProdutoDTO produtoDTO) {
		
	}

}

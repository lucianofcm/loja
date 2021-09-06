package com.microservices.loja.dto;

import java.util.Set;

import com.microservices.loja.domain.Preco;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDTO {
	private Integer id;

	private String descricao;

	private String nome;

	private Set<Preco> listaPrecos;
}

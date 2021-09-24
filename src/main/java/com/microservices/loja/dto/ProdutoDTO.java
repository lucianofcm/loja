package com.microservices.loja.dto;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class ProdutoDTO {
	private Integer id;

	private String descricao;

	private String nome;

	private PrecoDTO preco;
	
	private Set<PrecoDTO> listaPrecos;
}

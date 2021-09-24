package com.microservices.loja.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrecoDTO {
	private Integer id;

	private BigDecimal valorProduto;

	private ProdutoDTO produto;

	private LocalDateTime inicioValidade;

	private LocalDateTime fimValidade;
}

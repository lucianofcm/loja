package com.microservices.loja.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.microservices.loja.domain.Produto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrecoDTO {
	private Integer id;

	private BigDecimal valorProduto;

	private Produto produto;

	private LocalDateTime inicioValidade;

	private LocalDateTime fimValidade;
}

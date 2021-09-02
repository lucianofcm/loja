package com.microservices.loja.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemCompraDTO {
	private Long id;
	private String nome;
	private Integer qtde;
}

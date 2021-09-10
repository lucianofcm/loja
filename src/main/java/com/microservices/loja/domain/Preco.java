package com.microservices.loja.domain;



import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Preco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column
	private BigDecimal valorProduto;
	
	@ManyToOne
	private Produto produto;
	
	@Column(columnDefinition = "TIMESTAMP")
	private LocalDateTime inicioValidade;
	
	@Column(columnDefinition = "TIMESTAMP")
	private LocalDateTime fimValidade;
	

}

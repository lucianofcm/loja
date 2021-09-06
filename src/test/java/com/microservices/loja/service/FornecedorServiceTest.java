package com.microservices.loja.service;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockRestServiceServer;

import com.microservices.loja.dto.ProdutoDTO;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class FornecedorServiceTest {

	
	@Autowired
    private FornecedorService client;

    

	@Test
	void testListarProdutosFornecedor() throws Exception {
		List<ProdutoDTO> lstProdutos = this.client.listarProdutosFornecedor().getBody();
	}

}

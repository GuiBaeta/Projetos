package edu.gbaeta;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;

import edu.gbaeta.dao.IProdutoDAO;
import edu.gbaeta.dao.ProdutoDAO;
import edu.gbaeta.domain.Produto;


/**
 * @author GuilhermeBaeta
 */
public class ProdutoTest {

	@Test
	public void cadastrarTest() throws Exception {
		IProdutoDAO dao = new ProdutoDAO();
		
		//Criação e cadastrado de um produto
		Produto produto = new Produto();
		produto.setCodigo("01");
		produto.setNome("PlayStation 5");
		produto.setDescricao("Modelo com leitor e 1tb de armazenamento");
		produto.setValor(new BigDecimal("4000.00"));
		
		Integer qtd = dao.cadastrar(produto);
		assertTrue(qtd == 1);
		
		//Criação e cadastrado do segundo produto
		Produto produto2 = new Produto();
		produto2.setCodigo("02");
		produto2.setNome("Xbox Serie X - preto");
		produto2.setDescricao("Modelo sem leitor e 1tb de armazenamento");
		produto2.setValor(new BigDecimal("3000.00"));
		
		Integer qtd2 = dao.cadastrar(produto2);
		assertTrue(qtd2 == 1);
		
		//Consulta de um produto
		Produto produtoBD = dao.consultar(produto.getCodigo());
		assertNotNull(produtoBD);
		assertNotNull(produtoBD.getId());
		assertEquals(produto.getCodigo(), produtoBD.getCodigo());
		assertEquals(produto.getNome(), produtoBD.getNome());
		assertEquals(produto.getDescricao(), produtoBD.getDescricao());
		assertEquals(produto.getValor(), produtoBD.getValor());
		
		//Consulta do segundo produto
		Produto produtoBD2 = dao.consultar(produto2.getCodigo());
		assertNotNull(produtoBD2);
		assertNotNull(produtoBD2.getId());
		assertEquals(produto.getDescricao(), produtoBD.getDescricao());
		assertEquals(produto.getValor(), produtoBD.getValor());
		
		
		//Consultar todos os produto
		List<Produto> todosProdutos = dao.consultarTodos();
		assertNotNull(todosProdutos);
		assertTrue(todosProdutos.size() >= 2);
		
		//Atualizar segundo produto 
		dao.consultar(produtoBD.getCodigo());
		assertNotNull(produtoBD);
		assertNotNull(produtoBD.getId());
		
		produtoBD.setNome("PlayStation 5 - Sem Leitor");
		produtoBD.setDescricao("Sem leitor e 1tb de armazenamento");
		produtoBD.setValor(new BigDecimal("3400.00"));
		
		Integer qtdAtualizar = dao.atualizar(produtoBD);
		assertTrue(qtdAtualizar == 1);
				
		//Consultar novamente o produto para verificar a atualização
		Produto produtoAtualizado = dao.consultar(produtoBD.getCodigo());
		assertNotNull(produtoAtualizado);
		assertEquals("PlayStation 5 - Sem Leitor", produtoAtualizado.getNome());
		assertEquals("Sem leitor e 1tb de armazenamento", produtoAtualizado.getDescricao());
		assertEquals(new BigDecimal("3400.00"), produtoAtualizado.getValor());

		
		//Deletar testes da tabela
		Integer  qtdDel = dao.excluir(produtoBD);
		assertNotNull(qtdDel);
		
		Integer  qtdDel2 = dao.excluir(produtoBD2);
		assertNotNull(qtdDel2);
		

	}

}
/**
 * 
 */
package br.com.gbaeta;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.gbaeta.dao.IProdutoDAO;
import br.com.gbaeta.dao.ProdutoDaoMock;
import br.com.gbaeta.domain.Produto;
import br.com.gbaeta.exceptions.DAOException;
import br.com.gbaeta.exceptions.TipoChaveNaoEncontradaException;
import br.com.gbaeta.services.IProdutoService;
import br.com.gbaeta.services.ProdutoService;

/**
 * @author GuilhermeBaeta
 *
 */
public class ProdutoServiceTest {

	private IProdutoService produtoService;
	
	private Produto produto;
	
	public ProdutoServiceTest() {
		IProdutoDAO dao = new ProdutoDaoMock();
		produtoService = new ProdutoService(dao);
	}
	
	@Before
	public void init() {
		produto = new Produto();
		produto.setCodigo("A1");
		produto.setDescricao("Produto 1");
		produto.setNome("Produto 1");
		produto.setValor(BigDecimal.TEN);
	}
	
	@Test
	public void pesquisar() throws DAOException {
		Produto produtor = this.produtoService.consultar(produto.getCodigo());
		Assert.assertNotNull(produtor);
	}
	
	@Test
	public void salvar() throws TipoChaveNaoEncontradaException, DAOException {
		Boolean retorno = produtoService.cadastrar(produto);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluir() throws DAOException {
		produtoService.excluir(produto.getCodigo());
	}
	
	@Test
	public void alterarProduto() throws TipoChaveNaoEncontradaException, DAOException {
		produto.setNome("Produto Editado");
		produtoService.alterar(produto);
		
		Assert.assertEquals("Produto Editado", produto.getNome());
	}
}

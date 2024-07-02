/**
 * 
 */
package br.com.gbaeta;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.gbaeta.dao.ClienteDaoMock;
import br.com.gbaeta.dao.IClienteDAO;
import br.com.gbaeta.domain.Cliente;
import br.com.gbaeta.exception.TipoChaveNaoEncontradaException;

/**
 * @author GuilhermeBaeta
 */
public class ClienteDAOTest {

	private IClienteDAO clienteDao;
	
	private Cliente cliente;
	
	public ClienteDAOTest() {
		clienteDao = new ClienteDaoMock();
	}
	
	@Before
	public void init() throws TipoChaveNaoEncontradaException {
		cliente = new Cliente("Guilherme","12345678912", "31999999999", "Rua 1", "10", "Belo Horizonte","MG");
//		cliente.setCpf(12345678912L);
//		cliente.setNome("Guilherme");
//		cliente.setCidade("Belo Horizonte");
//		cliente.setEnd("Rua 1");
//		cliente.setEstado("MG");
//		cliente.setNumero(10);
//		cliente.setTel(31999999999L);
		clienteDao.cadastrar(cliente);
	}
	
	@Test
	public void pesquisarCliente() {
		
		Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteDao.cadastrar(cliente);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteDao.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Guilherme Baeta");
		clienteDao.alterar(cliente);
		
		Assert.assertEquals("Guilherme Baeta", cliente.getNome());
		
	}
	
}

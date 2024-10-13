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
import br.com.gbaeta.exceptions.DAOException;
import br.com.gbaeta.exceptions.TipoChaveNaoEncontradaException;
import br.com.gbaeta.services.ClienteService;
import br.com.gbaeta.services.IClienteService;

/**
 * @author GuilhermeBaeta
 *
 */
public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(12312312312L);
		cliente.setNome("Guilherme");
		cliente.setCidade("Belo Horizonte");
		cliente.setEnd("End");
		cliente.setEstado("MG");
		cliente.setNumero(10);
		cliente.setTel(1199999999L);
		
	}
	
	@Test
	public void pesquisarCliente() throws DAOException {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException, DAOException {
		Boolean retorno = clienteService.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() throws DAOException {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException, DAOException {
		cliente.setNome("GuilhermeBaeta");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("GuilhermeBaeta", cliente.getNome());
	}
}

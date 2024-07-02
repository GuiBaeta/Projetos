package br.com.gbaeta;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.gbaeta.dao.ClienteDaoMock;
import br.com.gbaeta.dao.IClienteDAO;
import br.com.gbaeta.domain.Cliente;
import br.com.gbaeta.exception.TipoChaveNaoEncontradaException;
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
		cliente = new Cliente("Guilherme","12345678912", "31999999999", "Rua 1", "10", "Belo Horizonte","MG");
//		cliente.setCpf(12345678912L);
//		cliente.setNome("Guilherme");
//		cliente.setCidade("Belo Horizonte");
//		cliente.setEnd("Rua 1");
//		cliente.setEstado("MG");
//		cliente.setNumero(10);
//		cliente.setTel(31999999999L);
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteService.salvar(cliente);
		Assert.assertTrue(retorno);
	}
	
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Guilherme Baeta");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Guilherme Baeta", cliente.getNome());
	}

}

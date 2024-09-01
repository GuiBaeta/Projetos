/**
 * 
 */
package edu.gbaeta;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;

import edu.gbaeta.dao.ClienteDAO;
import edu.gbaeta.dao.IClienteDAO;
import edu.gbaeta.domain.Cliente;

/**
 * @author GuilhermeBaeta
 */
public class ClienteTest {
	
	@Test
	public void cadastrarTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();
		
		//Criação e cadastrado de um cliente
		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Guilherme Baeta");
		
		Integer qtd = dao.cadastrar(cliente);
		assertTrue(qtd == 1);
		
		//Criação e cadastrado do segundo cliente
	    Cliente cliente2 = new Cliente();
		cliente2.setCodigo("02");
		cliente2.setNome("Rafael Baeta");
		
		Integer qtd2 = dao.cadastrar(cliente2);
		assertTrue(qtd2 == 1);
		
		//Consulta de um cliente
		Cliente clienteBD = dao.consultar(cliente.getCodigo());
		assertNotNull(clienteBD);
		assertNotNull(clienteBD.getId());
		assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
		assertEquals(cliente.getNome(), clienteBD.getNome());
		
		//Consulta do segundo cliente
		Cliente clienteBD2 = dao.consultar(cliente2.getCodigo());
		assertNotNull(clienteBD2);
		assertNotNull(clienteBD2.getId());
		assertEquals(cliente2.getCodigo(), clienteBD2.getCodigo());
		assertEquals(cliente2.getNome(), clienteBD2.getNome());
		
		//Consultar todos os clientes
		List<Cliente> todosClientes = dao.consultarTodos();
		assertNotNull(todosClientes);
		assertTrue(todosClientes.size() >= 2);
		
		//Atualizar segundo cliente 
		dao.consultar(clienteBD2.getCodigo());
		assertNotNull(clienteBD2);
		assertNotNull(clienteBD2.getId());
		
		clienteBD2.setNome("Marcelo");
		
		Integer qtdAtualizar = dao.atualizar(clienteBD2);
		assertTrue(qtdAtualizar == 1);
		
		//Consultar novamente o cliente para verificar a atualização
		Cliente clienteAtualizado = dao.consultar(clienteBD2.getCodigo());
		assertNotNull(clienteAtualizado);
		assertEquals("Marcelo", clienteAtualizado.getNome());

		
		//Deletar testes da tabela
		Integer  qtdDel = dao.excluir(clienteBD);
		assertNotNull(qtdDel);
		
		Integer  qtdDel2 = dao.excluir(clienteBD2);
		assertNotNull(qtdDel2);
	}

}

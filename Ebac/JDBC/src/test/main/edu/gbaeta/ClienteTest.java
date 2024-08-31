/**
 * 
 */
package edu.gbaeta;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
		
		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Guilherme Baeta");
		
		Integer qtd = dao.cadastrar(cliente);
		assertTrue(qtd == 1);
		
		Cliente clienteBD = dao.consultar(cliente.getCodigo());
		assertNotNull(clienteBD);
		assertNotNull(clienteBD.getId());
		assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
		assertEquals(cliente.getNome(), clienteBD.getNome());
		
		Integer  qtdDel = dao.excluir(clienteBD);
		assertNotNull(qtdDel);
	}

}

/**
 * 
 */
package edu.gbaeta.dao;

import java.util.List;

import edu.gbaeta.domain.Cliente;

/**
 * @author GuilhermeBaeta
 */
public interface IClienteDAO {
	
	public Integer cadastrar(Cliente cliente) throws Exception;

	public Cliente consultar(String codigo) throws Exception;

	public Integer excluir(Cliente cliente) throws Exception;

	List<Cliente> consultarTodos() throws Exception;

	public Integer atualizar(Cliente cliente) throws Exception;


}

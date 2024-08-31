/**
 * 
 */
package edu.gbaeta.dao;

import edu.gbaeta.domain.Cliente;

/**
 * @author GuilhermeBaeta
 */
public interface IClienteDAO {
	
	public Integer cadastrar(Cliente cliente) throws Exception;

	public Cliente consultar(String codigo) throws Exception;

	public Integer excluir(Cliente clienteBD) throws Exception;
	

}

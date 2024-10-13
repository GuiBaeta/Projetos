/**
 * 
 */
package br.com.gbaeta.services;

import br.com.gbaeta.domain.Cliente;
import br.com.gbaeta.exceptions.DAOException;
import br.com.gbaeta.services.generic.IGenericService;

/**
 * @author GuilhermeBaeta
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}

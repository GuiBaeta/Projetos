/**
 * 
 */
package br.com.gbaeta.services;

import br.com.gbaeta.dao.IClienteDAO;
import br.com.gbaeta.domain.Cliente;
import br.com.gbaeta.exceptions.DAOException;
import br.com.gbaeta.exceptions.MaisDeUmRegistroException;
import br.com.gbaeta.exceptions.TableException;
import br.com.gbaeta.services.generic.GenericService;

/**
 * @author GuilhermeBaeta
 *
 */
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	//private IClienteDAO clienteDAO;
	
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		//this.clienteDAO = clienteDAO;
	}

//	@Override
//	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
//		return clienteDAO.cadastrar(cliente);
//	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

//	@Override
//	public void excluir(Long cpf) {
//		clienteDAO.excluir(cpf);
//	}
//
//	@Override
//	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException{
//		clienteDAO.alterar(cliente);
//	}

}

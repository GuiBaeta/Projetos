package br.com.gbaeta.dao;

import java.util.Collection;

import br.com.gbaeta.domain.Cliente;
import br.com.gbaeta.exception.TipoChaveNaoEncontradaException;

public class ClienteDaoMock implements IClienteDAO{

	@Override
	public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void excluir(Long valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente consultar(Long valor) {
		Cliente cliente = new Cliente("Guilherme","12345678912", "31999999999", "Rua 1", "10", "Belo Horizonte","MG");
		cliente.setCpf(valor);
		return cliente;
	}

	@Override
	public Collection<Cliente> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	


}

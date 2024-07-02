package br.com.gbaeta.services;

import br.com.gbaeta.domain.Cliente;
import br.com.gbaeta.exception.TipoChaveNaoEncontradaException;

/**
 * @author GuilhermeBaeta
 */

public interface IClienteService {

	Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}

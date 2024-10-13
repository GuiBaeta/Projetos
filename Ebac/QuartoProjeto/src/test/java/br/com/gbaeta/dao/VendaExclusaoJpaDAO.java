/**
 * 
 */
package br.com.gbaeta.dao;

import br.com.gbaeta.dao.generic.jpa.GenericJpaDAO;
import br.com.gbaeta.dao.jpa.IVendaJpaDAO;
import br.com.gbaeta.domain.jpa.VendaJpa;
import br.com.gbaeta.exceptions.DAOException;
import br.com.gbaeta.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author GuilhermeBaeta
 *
 * Classe utilizada somente no teste para fazer a exclusão das vendas
 *
 */
public class VendaExclusaoJpaDAO extends GenericJpaDAO<VendaJpa, Long> implements IVendaJpaDAO {

	public VendaExclusaoJpaDAO() {
		super(VendaJpa.class);
	}

	@Override
	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public VendaJpa consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}
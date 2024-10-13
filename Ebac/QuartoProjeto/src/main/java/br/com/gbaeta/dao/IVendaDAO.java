/**
 * 
 */
package br.com.gbaeta.dao;

import br.com.gbaeta.dao.generic.IGenericDAO;
import br.com.gbaeta.domain.Venda;
import br.com.gbaeta.exceptions.DAOException;
import br.com.gbaeta.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author GuilhermeBaeta
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}

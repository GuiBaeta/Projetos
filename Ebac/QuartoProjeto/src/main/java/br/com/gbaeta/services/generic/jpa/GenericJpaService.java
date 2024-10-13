/**
 * 
 */
package br.com.gbaeta.services.generic.jpa;

import java.io.Serializable;
import java.util.Collection;

import br.com.gbaeta.dao.Persistente;
import br.com.gbaeta.dao.generic.jpa.IGenericJapDAO;
import br.com.gbaeta.exceptions.DAOException;
import br.com.gbaeta.exceptions.MaisDeUmRegistroException;
import br.com.gbaeta.exceptions.TableException;
import br.com.gbaeta.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author GuilhermeBaeta
 *
 */
public abstract class GenericJpaService<T extends Persistente, E extends Serializable> 
	implements IGenericJpaService<T, E> {
	
	protected IGenericJapDAO<T, E> dao;
	
	public GenericJpaService(IGenericJapDAO<T, E> dao) {
		this.dao = dao;
	}
	

	@Override
	public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
		return this.dao.cadastrar(entity);
	}

	@Override
	public void excluir(T entity) throws DAOException {
		this.dao.excluir(entity);
	}

	@Override
	public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
		return this.dao.alterar(entity);
	}

	@Override
	public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException {
		return this.dao.consultar(valor);
	}

	@Override
	public Collection<T> buscarTodos() throws DAOException {
		return this.dao.buscarTodos();
	}
	

}

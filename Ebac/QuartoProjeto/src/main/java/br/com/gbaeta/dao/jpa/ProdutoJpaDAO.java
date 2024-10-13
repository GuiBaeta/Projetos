/**
 * 
 */
package br.com.gbaeta.dao.jpa;

import br.com.gbaeta.dao.generic.jpa.GenericJpaDAO;
import br.com.gbaeta.domain.jpa.ProdutoJpa;

/**
 * @author GuilhermeBaeta
 *
 */
public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}

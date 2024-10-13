/**
 * 
 */
package br.com.gbaeta.dao.jpa;

import br.com.gbaeta.dao.generic.jpa.GenericJpaDAO;
import br.com.gbaeta.domain.jpa.ClienteJpa;

/**
 * @author GuilhermeBaeta
 *
 */
public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}

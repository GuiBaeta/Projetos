/**
 * 
 */
package br.com.gbaeta.services;

import br.com.gbaeta.dao.IProdutoDAO;
import br.com.gbaeta.domain.Produto;
import br.com.gbaeta.services.generic.GenericService;

/**
 * @author GuilhermeBaeta
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}

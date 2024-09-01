package edu.gbaeta.dao;

import java.util.List;

import edu.gbaeta.domain.Produto;

/**
 * @author GuilhermeBaeta
 */
public interface IProdutoDAO {

	public Integer cadastrar(Produto produto) throws Exception;

	public Produto consultar(String codigo) throws Exception;

	public Integer excluir(Produto produto) throws Exception;
	
	List<Produto> consultarTodos() throws Exception;

	public Integer atualizar(Produto produto) throws Exception;
	

}

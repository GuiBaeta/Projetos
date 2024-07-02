package br.com.gbaeta.fabrica;

import br.com.gbaeta.domain.Persistente;
import br.com.gbaeta.domain.Produto;
import br.com.gbaeta.exception.DadosInvalidosException;

public class ProdutoFabrica implements FabricaPersistente {

    @Override
    public Persistente criarObjeto(String[] dados) throws DadosInvalidosException {
        try {
            Produto produto = new Produto();
            produto.setCodigo(Long.parseLong(dados[0].trim()));
            produto.setNome(dados[1]);
            return produto;
        } catch(IndexOutOfBoundsException e) {
            throw new DadosInvalidosException("Dados de produto estão inválidos");
        }
    }
}

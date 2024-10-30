package gbaeta.facade;

import gbaeta.facade.CEP.CepApi;
import gbaeta.facade.subsistemaCRM.CrmService;

public class Facade {
	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);

		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}

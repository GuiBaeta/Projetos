package com.gbaeta.gof;

import com.gbaeta.subsistema1.CrmService;
import com.gbaeta.subsistema2.CepApi;

public class Facade {
	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);

		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}

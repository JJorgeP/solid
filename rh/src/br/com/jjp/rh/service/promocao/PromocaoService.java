package br.com.jjp.rh.service.promocao;

import br.com.jjp.rh.ValidacaoException;
import br.com.jjp.rh.model.Cargo;
import br.com.jjp.rh.model.Funcionario;

public class PromocaoService {
	
	public void promover(Funcionario funcionario, boolean metaBatida) {
		Cargo cargoAtual = funcionario.getCargo();
		if (Cargo.GERENTE == cargoAtual) {
			throw new ValidacaoException("Gerente n�o podem ser promovidos");
		}
		
		if (metaBatida) {
			Cargo novoCargo = cargoAtual.getProximoCargo();
			funcionario.promover(novoCargo);
		} else {
			throw new ValidacaoException("Funcion�rio n�o bateu a meta!");
		}
	}

}

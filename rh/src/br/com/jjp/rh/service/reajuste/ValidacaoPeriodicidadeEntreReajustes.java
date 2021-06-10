package br.com.jjp.rh.service.reajuste;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.jjp.rh.ValidacaoException;
import br.com.jjp.rh.model.Funcionario;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste {
	
	public void validar(Funcionario funcionario, BigDecimal aumento) {
		BigDecimal salarioAtual = funcionario.getSalario();
		BigDecimal percentualReajuste = aumento.divide(salarioAtual , RoundingMode.HALF_UP);
		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste n�o pode ser superior a 40% do sal�rio!");
		}
	}

}

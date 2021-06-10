package br.com.jjp.rh.service.reajuste;

import java.math.BigDecimal;

import br.com.jjp.rh.model.Funcionario;

public interface ValidacaoReajuste {
	
	void validar(Funcionario funcionario, BigDecimal aumento);

}

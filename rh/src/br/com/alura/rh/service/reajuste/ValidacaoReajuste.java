package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;

import br.com.alura.rh.model.Funcionario;

//Interface criada para melhorar extensibilidade
//da classe reajuste e das validações.
public interface ValidacaoReajuste {

	void validar(Funcionario funcionario, BigDecimal aumento);
}

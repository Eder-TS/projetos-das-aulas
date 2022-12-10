package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.rh.model.Funcionario;

public class ReajusteService {

	private List<ValidacaoReajuste> validacoes;

	//Construtor da classe acopla a classe as validações, 
	//porém se as regras mudarem nas validações, ou forem adicionadas
	//novas validações, esta classe não sofre alteração.
	public ReajusteService(List<ValidacaoReajuste> validacoes) {
		this.validacoes = validacoes;
	}

	// Método extraído da classe Funcionario
	// Aqui trata do reajuste e lá apenas do funcionário
	public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {

		this.validacoes.forEach(v -> v.validar(funcionario, aumento));
		// Se nenhuma excessão for lançada pelas validações
		// o aumanto será dado.
		BigDecimal salarioReajustado = funcionario.getDadosPessoais().getSalario().add(aumento);
		funcionario.atualizarSalario(salarioReajustado);
	}
}

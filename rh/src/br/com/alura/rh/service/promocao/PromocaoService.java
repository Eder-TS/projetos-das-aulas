package br.com.alura.rh.service.promocao;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {
	
	public void promover(Funcionario funcionario, boolean metaBatida) {
		Cargo cargoAtual = funcionario.getDadosPessoais().getCargo();
		//Já verifica se é gerente e sai do método com uma excessão.
		if (Cargo.GERENTE == cargoAtual) {
			throw new ValidacaoException("Gerente não pode ser promovido.");
		}
		
		if (metaBatida) {
			Cargo novoCargo = cargoAtual.getProximoCargo();
			funcionario.promove(novoCargo);
		} else {
			throw new ValidacaoException("Funcionario não bateu a meta.");
		}
	}
}

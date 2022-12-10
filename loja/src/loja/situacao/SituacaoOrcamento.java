package loja.situacao;

import java.math.BigDecimal;

import loja.DomainException;
import loja.orcamento.Orcamento;

//Implementação design pattern State
public abstract class SituacaoOrcamento {

	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	public void aprovar(Orcamento orcamento) {
		throw new DomainException("Orçamento não pode ser aprovado.");
	}
	
	public void reprovar(Orcamento orcamento) {
		throw new DomainException("Orçamento não pode ser reprovado.");
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new DomainException("Orçamento não pode ser finalizado.");
	}
}

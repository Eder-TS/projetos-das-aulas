package loja.desconto;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public class DescontoPorQuantidade extends Desconto {

	public DescontoPorQuantidade(Desconto proximo) {
		super(proximo);
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}
}

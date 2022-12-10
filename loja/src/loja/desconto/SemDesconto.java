package loja.desconto;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public class SemDesconto extends Desconto {

	public SemDesconto() {
		super(null);
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return true;
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

}

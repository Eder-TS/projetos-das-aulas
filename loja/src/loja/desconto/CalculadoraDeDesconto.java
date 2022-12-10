package loja.desconto;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

//Implementado design pattern Chain of Responsibility
public class CalculadoraDeDesconto {

	public BigDecimal calcular(Orcamento orcamento) {
		Desconto cadeiaDeDescontos = new DescontoPorQuantidade(
								new DescontoPorValor(
									new SemDesconto()));
		
		return cadeiaDeDescontos.calcular(orcamento);
	}
}

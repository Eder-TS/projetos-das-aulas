package loja.imposto;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

//Implementado design pattern Strategy
public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}	
}

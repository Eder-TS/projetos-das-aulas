package loja;

import java.math.BigDecimal;

import loja.desconto.CalculadoraDeDesconto;
import loja.orcamento.ItemOrcamento;
import loja.orcamento.Orcamento;

public class TesteDesconto {
	public static void main(String[] args) {
		
		Orcamento orcamento1 = new Orcamento();
		orcamento1.adicionarItem(new ItemOrcamento(new BigDecimal("23")));
		orcamento1.adicionarItem(new ItemOrcamento(new BigDecimal("50")));
		orcamento1.adicionarItem(new ItemOrcamento(new BigDecimal("50")));
		orcamento1.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
		orcamento1.adicionarItem(new ItemOrcamento(new BigDecimal("75")));
		orcamento1.adicionarItem(new ItemOrcamento(new BigDecimal("25")));
		
		Orcamento orcamento2 = new Orcamento();
		orcamento2.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));
		
		CalculadoraDeDesconto calcuadora = new CalculadoraDeDesconto();
		
		System.out.println(calcuadora.calcular(orcamento1));
		System.out.println(calcuadora.calcular(orcamento2));
	}
}

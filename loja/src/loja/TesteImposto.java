package loja;

import java.math.BigDecimal;

import loja.imposto.CalculadoraDeImpostos;
import loja.imposto.ICMS;
import loja.imposto.ISS;
import loja.orcamento.ItemOrcamento;
import loja.orcamento.Orcamento;

public class TesteImposto {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		ItemOrcamento item1 = new ItemOrcamento(new BigDecimal("100"));
		
		orcamento.adicionarItem(item1);
		
		CalculadoraDeImpostos calcuadora = new CalculadoraDeImpostos();
		
		System.out.println(calcuadora.calcular(orcamento, new ICMS(new ISS(null))));
		System.out.println(calcuadora.calcular(orcamento, new ICMS(null)));
		System.out.println(calcuadora.calcular(orcamento, new ISS(null)));
		System.out.println(calcuadora.calcular(orcamento, new ISS(new ICMS(null))));
	}
}

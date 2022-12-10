package loja.imposto;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

//Aplicando o pattern Decorator
//para ter a opção de somar um imposto a outro, 
//podendo ter vários impostos e várias combinações entre eles.
public abstract class Imposto {
	
	private Imposto outro;
	
	public Imposto(Imposto outro) {
		this.outro = outro;
	}
	
	protected abstract BigDecimal realizarCalculo(Orcamento orcamento);
	
	public BigDecimal calcular(Orcamento orcamento) {
		BigDecimal valorImposto = realizarCalculo(orcamento);
		BigDecimal valorOutroImposto = BigDecimal.ZERO;
		
		if (outro != null) {
			valorOutroImposto = outro.realizarCalculo(orcamento);
		}
		return valorImposto.add(valorOutroImposto);
	}
}

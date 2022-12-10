package loja.orcamento;

import java.math.BigDecimal;

//Aplicando o pattern Composite
public class ItemOrcamento implements Orcavel {

	private BigDecimal valor;

	public ItemOrcamento(BigDecimal valor) {
		this.valor = valor;
	}
	
	public BigDecimal getValor() {
		return valor;
	}
}

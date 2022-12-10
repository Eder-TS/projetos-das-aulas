package loja;

import java.math.BigDecimal;

import loja.orcamento.ItemOrcamento;
import loja.orcamento.Orcamento;
import loja.orcamento.OrcamentoProxy;

public class TesteComposicao {

	public static void main(String[] args) {
		Orcamento antigo = new Orcamento();
		antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		antigo.reprovar();
		
		Orcamento novo = new Orcamento();
		novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
		novo.adicionarItem(antigo);
		
		OrcamentoProxy proxy = new OrcamentoProxy(novo);		
		
//		System.out.println(novo.getValor()); Aqui há uma demora da API de terceiro,
//		System.out.println(novo.getValor()); uma nova chamada continua com a demora
											// se houvesse uma necessidade entre uma chamada e outra
											// meu sistema teria de ficar esperando.
		System.out.println(proxy.getValor());//Aqui ocorre a primeira busca externa
		System.out.println(proxy.getValor());//e aqui já busca no "cache".
		
		proxy.aprovar();
		proxy.finalizar();
		
		System.out.println(proxy.isFinalizado());
	}

}

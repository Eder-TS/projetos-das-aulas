package loja;

import java.math.BigDecimal;

import loja.http.JavaHttpClient;
import loja.orcamento.ItemOrcamento;
import loja.orcamento.Orcamento;
import loja.orcamento.RegistroDeOrcamento;

public class TestesAdapter {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		ItemOrcamento item1 = new ItemOrcamento(new BigDecimal("200"));
		
		orcamento.adicionarItem(item1);
		orcamento.aprovar();
		orcamento.finalizar();
		
		JavaHttpClient cliente  = new JavaHttpClient();
		
		RegistroDeOrcamento registro = new RegistroDeOrcamento(cliente);
		registro.registrar(orcamento);
	}

}

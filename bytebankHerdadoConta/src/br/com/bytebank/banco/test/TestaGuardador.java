package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TestaGuardador {

	public static void main(String[] args) {
		GuardadorDeContas xaxa = new GuardadorDeContas();
		
		Conta cc1 = new ContaCorrente(12, 67);
		Conta cc2 = new ContaCorrente(12, 87);
		
		xaxa.adiciona(cc1);
		xaxa.adiciona(cc2);
		
		int tamanhoGuardador = xaxa.getQuantidadeDeElementos();
		System.out.println(tamanhoGuardador);
		
		Conta ref = xaxa.getReferencia(0);
		System.out.println(ref.getNumero());
	}

}

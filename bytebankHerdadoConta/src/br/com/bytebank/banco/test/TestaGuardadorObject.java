package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TestaGuardadorObject {

	public static void main(String[] args) {
		GuardadorDeReferencias guard = new GuardadorDeReferencias();
		
//		Object obj = new Object();
//		obj.getClass();
		Conta conta = new ContaCorrente(23, 78);
		
		guard.adiciona(conta);
		
		int um = guard.getQuantidadeDeReferencias();
		System.out.println(um);
		
		ContaCorrente ref = (ContaCorrente)guard.getReferencias(0);
		System.out.println(ref.getNumero());
		

	}

}

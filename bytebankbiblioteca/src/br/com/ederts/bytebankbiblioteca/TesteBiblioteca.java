package br.com.ederts.bytebankbiblioteca;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteBiblioteca {

	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente(23,45);
		cc.deposita(400);
		System.out.println(cc.getSaldo());

	}

}

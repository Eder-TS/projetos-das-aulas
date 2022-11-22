package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
//declarando import não preciso usar o FQN nas implementações das classes


public class TestaContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(234, 78);
		cc.deposita(200);
		Cliente jaco = new Cliente();//teste para resolver outro problema 
		jaco.setNome("Jacó");
		cc.setTitular(jaco);
		System.out.println(cc.getTitular().getNome());
		
		ContaPoupanca cp = new ContaPoupanca(453, 45);
		cp.deposita(345);

		try {
			cc.transfere(45, cp);
		} catch (Exception ex) {
			System.out.println("Saldo");
		}
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());

		try {
			cc.saca(10);
		} catch (Exception ex) {
			System.out.println("Saldo");
		}
		System.out.println(cc.getSaldo());

	}

}

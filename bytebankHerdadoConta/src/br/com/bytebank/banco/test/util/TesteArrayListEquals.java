package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		
		Conta cc1 = new ContaCorrente(23,56);
		Conta cp2 = new ContaPoupanca(23, 68);
		
		lista.add(cc1);
		lista.add(cp2);
		
		Conta cc3 = new ContaCorrente(23, 56);
		
		//método contains que usa o equals
		boolean existe = lista.contains(cc3);
		System.out.println("Já existe? " + existe);
		//após a sobrescrita do método equals, o método contains funciona para este código
		
		for (Conta conta : lista) {
			if (conta == cc3) {
				System.out.println(true);
			}
		}
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		//aqui está sendo testada a sobrescrita do método equals do pacote .util
		System.out.println(cc1.equals(cc3));
		System.out.println(cc1.equals(cp2));
		System.out.println("-------");
		System.out.println(cc1.equals(cc3));
		System.out.println("-----");
		//comparativo de agência e número dentro das contas
		for (Conta conta : lista) {
			if (conta.equals(cc3)) {
				System.out.println("Já tenho essa conta!");
			}
		}
		
	}

}

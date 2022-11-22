package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacao {

	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		cc2.setTitular(clienteCC2);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cc4.setTitular(clienteCC4);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		for (Conta conta : lista) {
			System.out.println(conta);
		}

		// implementando um reordenador de lista
		NumeroDaContaComparator comparador = new NumeroDaContaComparator();
		lista.sort(comparador);

		System.out.println("---------");

		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		
		System.out.println("-------------------");
//		NomeDoTitularComparator comparadorTitular = new NomeDoTitularComparator();
//		lista.sort(comparadorTitular); aqui pode ficar mais simples
		lista.sort(new NomeDoTitularComparator());
		
		
		for (Conta conta : lista) {
			System.out.println(conta + ", " + conta.getTitular().getNome());
		}
		
		System.out.println("-------------------");
		//classe Collections não é a mesma interface Collection que implementa lista e mais
		Collections.sort(lista);//aqui usando o método de ordem natural na classe Conta
								//sem ter definido um coparador aqui
		for (Conta conta : lista) {
			System.out.println(conta + ", " + conta.getSaldo());
		}
		
		System.out.println("Ordem reversa");
		Collections.reverse(lista);
		for (Conta conta : lista) {
			System.out.println(conta + ", " + conta.getSaldo());
		}
		
		System.out.println("Outra forma ordem natural");
		//outra forma de chamar a ordem natural é:
		lista.sort(null);
		for (Conta conta : lista) {
			System.out.println(conta + ", " + conta.getSaldo());
		}
		
	}

}

//Interface Comparator é usado pelo método sort(ordenar) dentro da classe List
//aqui as sobrecritas permitem ajustar o critério de comparação
class NomeDoTitularComparator implements Comparator<Conta> {// lambda expression

	@Override
	public int compare(Conta c1, Conta c2) {
		String nomeC1 = c1.getTitular().getNome();
		String nomeC2 = c2.getTitular().getNome();

		return nomeC1.compareTo(nomeC2);// método da classe String que verifica ordem alfabética
		// o método espera o retorno de um inteiro, se for menor que 0
		// c1<c2, se for maior que 0 c1>c2
		// assim para o método abaixo também

	}

}

class NumeroDaContaComparator implements Comparator<Conta> {// lambda expression

	@Override
	public int compare(Conta c1, Conta c2) {
		return Integer.compare(c1.getNumero(), c2.getNumero());//usando método da classe Integer
		
		//return c1.getNumero() - c2.getNumero();//usando aritmética
		
//		if (c1.getNumero() < c2.getNumero()) {
//			return -1;
//		}
//
//		if (c1.getNumero() > c2.getNumero()) {
//			return 1;
//		}
//
//		return 0;
	}

}

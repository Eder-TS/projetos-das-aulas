package br.com.bytebank.banco.test.util;

import java.util.LinkedList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaLinkedList {

	public static void main(String[] args) {
		//aqui o LinkedList se encaixa do mesmo jeito que o ArrayList
		//o código é o mesmo que está na classe de teste TesteArrayList
		//porém estas duas classes/funcionalidades (ArrayList e LinkedList) tem
		//alguma diferença de desempenho em algumas situações
		LinkedList<Conta> lista = new LinkedList<Conta>();
		//List<Conta> lista = new LinkedList<Conta>();
		//List<Conta> lista = new ArrayList<Conta>();
		//Também posso usar interface List e alternar entre Array e Linked
		//todo o códio abaixo funcionaria normalmente
		
		
		Conta cc1 = new ContaCorrente(23,56);
		Conta cp2 = new ContaPoupanca(23, 68);
		
		lista.add(cc1);
		lista.add(cp2);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta ref = lista.get(0);
		System.out.println("Primeira conta: " + ref.getNumero());
		
		lista.remove(0);
		System.out.println("Tamanho: "+ lista.size());
		Conta refe = lista.get(0);
		System.out.println("Primeira conta: " + ref.getNumero());
		
		Conta cc3 = new ContaCorrente(23, 439);
		Conta cp4 = new ContaPoupanca(23, 132);
		
		lista.add(cc3);
		lista.add(cp4);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		System.out.println("--------------------------");
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}

	}

}

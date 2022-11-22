package br.com.bytebank.banco.test.util;

import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaVector {

	public static void main(String[] args) {
		// aqui o Vector se encaixa do mesmo jeito que o ArrayList
		// o código é o mesmo que está na classe de teste TesteArrayList e LinkedList
		// porém estas três classes/funcionalidades (ArrayList, LinkedList e Vector) tem
		// alguma diferença de desempenho em algumas situações. A grande diferença é que o Vector é
		//usado para acessar uma mesma lista em duas ou mais pilhas diferentes
		List<Conta> lista = new Vector<Conta>();//thread safe
		//também poderia usar Collection<Conta> lista que é uma interface mãe acima
		//de List e acima de outras classes de conjunto de dados que não usam sequencias
		//porém com Collection, alguns métodos exclusivos para listas não irão funcionar
		

		Conta cc1 = new ContaCorrente(23, 56);
		Conta cp2 = new ContaPoupanca(23, 68);

		lista.add(cc1);
		lista.add(cp2);

		System.out.println("Tamanho: " + lista.size());

		Conta ref = lista.get(0);
		System.out.println("Primeira conta: " + ref.getNumero());

		lista.remove(0);
		System.out.println("Tamanho: " + lista.size());
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

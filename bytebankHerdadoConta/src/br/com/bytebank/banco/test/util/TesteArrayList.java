package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayList {

	public static void main(String[] args) {
		//Existe uma classe para melhor manuseio de Arrays
		//ArrayList lista = new ArrayList();este código também funciona mas fica marcado em amarelo
		//desta forma abaixo aceita apenas referências para objetos do tipo Conta
		//se chama tipagem
		ArrayList<Conta> lista = new ArrayList<Conta>();
		//<>Generics
		
		
		Cliente cliente = new Cliente();
		//lista.add(cliente);não compila pois a lista é do tipo conta
		
		Conta cc1 = new ContaCorrente(23,56);
		Conta cp2 = new ContaPoupanca(23, 68);
		
		lista.add(cc1);
		lista.add(cp2);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta ref = lista.get(0);
		System.out.println("Primeira conta: " + ref.getNumero());
		
		lista.remove(0);
		System.out.println("Tamanho: "+ lista.size());
		Conta refe = lista.get(0);//aqui não precisa fazer cast pois o compilador já sabe que a lista é do tipo Conta
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

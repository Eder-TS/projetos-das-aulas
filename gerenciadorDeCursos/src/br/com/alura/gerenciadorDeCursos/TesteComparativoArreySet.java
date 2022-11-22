package br.com.alura.gerenciadorDeCursos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TesteComparativoArreySet {

	public static void main(String[] args) {

		Collection<Integer> numerosArr = new ArrayList<Integer>();

		long inicioArr = System.currentTimeMillis();

		for (int i = 1; i <= 50000; i++) {
			numerosArr.add(i);
		}

		for (Integer numero : numerosArr) {
			numerosArr.contains(numero);
		}

		long fimArr = System.currentTimeMillis();

		long tempoDeExecucaoArr = fimArr - inicioArr;

		System.out.println("Tempo gasto Array: " + tempoDeExecucaoArr);
		
		/*-----------------------------------------------*/
		
		Collection<Integer> numeros = new HashSet<Integer>();

		long inicio = System.currentTimeMillis();

		for (int i = 1; i <= 50000; i++) {
			numeros.add(i);
		}

		for (Integer numero : numeros) {
			numeros.contains(numero);
		}

		long fim = System.currentTimeMillis();

		long tempoDeExecucao = fim - inicio;

		System.out.println("Tempo gasto Set: " + tempoDeExecucao);
		

	}

}

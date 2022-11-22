package br.com.alura.java8novidades;

import java.util.ArrayList;
import java.util.Comparator;
import static java.util.Comparator.*;//para declarar method reference ainda mais enxuto
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class CodigoMaisSucinto {

	public static void main(String[] args) {
		List<String> bla = new ArrayList<>();

		bla.add("Schmels");
		bla.add("milenio alienigena");
		bla.add("zero");

		// Abaixo implementando ordenação por comprimento da String
		// Como eu leio isso:
		bla.sort(Comparator.comparing(s -> s.length()));
		// bla ordene(.sort) comparando (Comparator.comparing) o tamanho de s (lambda)

		// Esta linha acima seria escrita da seguinte forma usando a
		// maneira antiga:
		Function<String, Integer> funcao = new Function<String, Integer>() {
			// funçao que pega o retorno Integer dado uma String
			@Override
			public Integer apply(String s) {
				return s.length();
			}
		};
		Comparator<String> comparador = Comparator.comparing(funcao);// comparador que usa o retorno da função
		bla.sort(comparador);
		System.out.println(bla);


		
		//Aqui implementando um forEach para impressão da maniera antiga
		Consumer<String> consumidorAnonimo = new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		};
		System.out.println("Impressão da classe anônima:");
		bla.forEach(consumidorAnonimo);
		//Porém, no Java 8...
		System.out.println("Java 8:");
		bla.forEach(System.out::println);//Se chama method reference
		//Na lista bla, para cada item println
		
		
		bla.sort(Comparator.comparing(s -> s.length()));
		bla.sort(Comparator.comparing(String::length));//method reference
		bla.sort(comparing(String::length));//aqui precisa import static Comparator.*
		
		bla.sort(comparing(String::hashCode));
		System.out.println("Ordenando por hashCode");
		bla.forEach(System.out::println);
	}

}

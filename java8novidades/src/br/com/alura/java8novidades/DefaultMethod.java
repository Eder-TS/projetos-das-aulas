package br.com.alura.java8novidades;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethod {
	public static void main(String[] args) {
		List<String> bla = new ArrayList<>();
		
		bla.add("Schmels");
		bla.add("milenio alienigena");
		bla.add("zero");
		
		//Método forEach implementado à classe List
		//bastando adequar o Consumer à finalidade desejada
		Consumer<String> consumidor = new ConsumidorDeString();//código escrito após o final do main
		bla.forEach(consumidor);
		//Aqui já posso usar uma classe anônima em vez de declarar uma nova classe,
		//isso para o caso de uma classe que usaria muito pouco, com um ou poucos métodos 
		Consumer<String> consumidorAnonimo = new Consumer<String>() {
			//Implemento o método que preciso sobrescrever diretamente onde vou usar
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		};
		System.out.println("Impressão da classe anônima:");
		bla.forEach(consumidorAnonimo);
		//Ainda posso fazer mais resumido não declarando a variável temporária
		//"consumidorAnonimo", declarando o new direto no forEach:
		bla.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		});//Cuidar para não tornar o código ilegível!
		
		//Entendendo a implementação de classe anônima, posso
		//dar um passo a diante com o Java 8 e usar uma expressão lambda:
		bla.forEach((String s) -> System.out.println(s));
		//Como o forEach só recebe Consumer e este só implementa accept, 
		//não preciso declarar tudo isso, apenas passo o objeto (String s), 
		//indico que é expressão lambda (->) e declaro o quê quero que faça
		//(System.out.println..., neste caso).
		//Se for declarar mais de uma statement (comando) dentro da expressão lambda então
		//mantenho os chaves.
		
		
		Comparator<String> comparador = new ComparadorDeString();
		bla.sort(comparador);
		System.out.println(bla);
		
		bla.sort((s1, s2) -> s2.length() - s1.length());
		//Neste caso passei dois argumentos, mas se for só um posso omitir os parêntesis.
		//Também posso omitir o tipo do argumento como foi feito aqui.
		System.out.println("Imprimindo sort com lambda: ordem reversa");
		System.out.println(bla);
		
		//Expressões lambda funcionam para interfaces funcionais
		
		//Se comentar as duas classes declaradas a seguir, as expressões lambda
		//continuarão a funcionar.
	}
}

class ComparadorDeString implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {	
		return s1.length() - s2.length();
	}
}

class ConsumidorDeString implements Consumer<String> {

	@Override
	public void accept(String s) {
		System.out.println(s);		
	}
	
}
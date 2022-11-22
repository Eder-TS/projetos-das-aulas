package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		//caso queira guardar primitivos em listas...
		//lembrando que listas guardam referências e não os valores em si
		int[] idades = new int[5];
		int idade = 29;
		//idades.add(idade);não compila pois add espera por um objeto e não por um primitivo
		
		//aqui usando diretamente a classe Integer pra instanciar um objeto que
		//guarda o valor 29
		Integer idadeRef = new Integer(29);//aqui fica taxado pois é deprecated (descontinuado)
		Integer idadeInt = Integer.valueOf(29);//forma mais atual para atribuir um
		Double maior = Double.valueOf(29);//primitivo ao seu resepectivo wrapper
		//em vez de usar o new, delego a atribuição a um método
		
		//aqui usando o autoboxing
		List<Integer> idadesArrayList = new ArrayList<Integer>();
		idadesArrayList.add(29);//autoboxing = transformando um primitivo num objeto
		//neste add aconteceu Integer.valueOf(29)
		int valor = idadesArrayList.get(0);//unboxing
		System.out.println("Valor convertido de objeto para primitivo: " + valor);
		
		//Cada primitivo tem uma classe correspondente, os wrappers (java.lang.Integer, etc)
		//primitivo para wrapper = Autoboxing ou boxing
		//wrapper para primitivo = unboxing
		//o motivo é para poder trabalhar com coleções

		//observando a assinatura do main também há um array do tipo String onde
		//podem ser passados argumentos para serem tratados. isso é muito
		//comum e o que acontece é que todos os argumentos são transformados em String
		//depois é preciso fazer o parsing: extração de informação de uma porção de dados
		String s = args[0];//aqui vai pegar o primeiro argumento recebido pelo main
							//passado, neste caso, pelo Run Configuration
		Integer num = Integer.valueOf(s);//método valueOf é sobrecarregado (tem mais de uma implementação)
		System.out.println("Argumento recebido pelo main: " + num + " Aqui ainda é objeto!");
		
		//porém se eu precisasse deste valor como primitivo teria de fazer o unboxing
		//tem uma maneira mais direta:
		int numPrimitivo = Integer.parseInt(s);//aqui faz parse diretamente para o primitivo
		System.out.println("Primitivo: " + numPrimitivo);
		
		//outras funcionalidades da classe
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE + "bits");
		System.out.println(Integer.BYTES);
		
		
		
	}

}

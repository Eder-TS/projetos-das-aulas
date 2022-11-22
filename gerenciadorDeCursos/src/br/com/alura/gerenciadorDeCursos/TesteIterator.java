package br.com.alura.gerenciadorDeCursos;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TesteIterator {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
		
		//Jeito "antigo" de percorrer uma coleção.
		List<Aula> aulas = javaColecoes.getAulas();
		Iterator<Aula> it = aulas.iterator();
		while (it.hasNext()) {
			System.out.println(it.next()); 
		}
		
		//Outro exemplo
		List<String> letras = new LinkedList<>();
        letras.add("A");
        letras.add("B");
        letras.add("C");
        
        Iterator<String> iterador = letras.iterator();
        while (iterador.hasNext()) {
        	System.out.println(iterador.next());
        }
        
	}

}

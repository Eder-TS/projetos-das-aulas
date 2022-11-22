package br.com.alura.gerenciadorDeCursos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAulas {

	public static void main(String[] args) {
		Aula a1 = new Aula("Revisitando as ArrayLists", 21);
		Aula a2 = new Aula("Listando Objetos", 20);
		Aula a3 = new Aula("Relacionamento de Listas e Objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a3);
		aulas.add(a2);
		aulas.add(a1);
		
		System.out.println(aulas);//usando o toString sobrescrito
		
		Collections.sort(aulas);//usando o sort sobrescrito
		System.out.println(aulas);
		
		Collections.sort(aulas,Comparator.comparing(Aula::getTempo));//outra maneira de ordendar egando o prórpio
																	//método da classe Aula
		System.out.println(aulas);
		
		//Em vez de fazer de usar a classe Collections e sobrescrever o método na classe Aula e
		//assinando o contratto com Collections, posso fazer como abaixo, apenas importando a 
		//classe Comparator e usando o próprio método getTempo já existente na classe Aula
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
	}

}

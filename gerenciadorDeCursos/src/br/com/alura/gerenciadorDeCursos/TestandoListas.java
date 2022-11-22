package br.com.alura.gerenciadorDeCursos;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de Listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		System.out.println(aulas);
		
		aulas.remove(0);
		System.out.println(aulas);
		
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
		
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é: " + primeiraAula);
		
		for (int i = 0; i < aulas.size(); i++) {//colecction sempre usa .size para o tamanho
			System.out.println("Aula: " + aulas.get(i));
		}
		
		aulas.forEach(aula -> { //lambda
			System.out.println("Percorrendo ->");
			System.out.println("Aula " + aula);
			});
		
		aulas.add("Aumentando o conecimento");
		System.out.println(aulas);
		
		Collections.sort(aulas);//Classe Collections dentro do pacote .util
		System.out.println(aulas);

		System.out.println(Aula.tempoTotalAulas());
	}

}

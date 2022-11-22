package br.com.alura.gerenciadorDeCursos;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		List<Aula> aulas = javaColecoes.getAulas();
		
		System.out.println(aulas);
		
		javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		
		System.out.println(aulas);
		//aulas.add(new Aula("Inserção direta", 1));//quero evitar que novos objetos
		//aula sejam adicionados fora da classe Curso
		
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
		
		
	}

}

package br.com.alura.gerenciadorDeCursos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));		
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		//Collections.sort(aulasImutaveis);aqui não funciona pois no método getAulas tornei a lista imutável
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);//criando novo Array com a lista imutável
															//mas a nova lista não é imutável
		Collections.sort(aulas);//ordenando a nova lista criada
		System.out.println(aulas);
		
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);//toString sobrescrito
		
		System.out.println(Aula.tempoTotalAulas());//a partir de variável estática na classe Aula
	}

}

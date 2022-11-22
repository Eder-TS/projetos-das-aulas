package br.com.alura.gerenciadorDeCursos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();// Set é conjunto, não lista
												// não tem ordem, não aceita mais de um do mesmo elemento

		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		System.out.println("Inseriu? " + alunos.add("Rodrigo Turini"));// não vai adicionar este elemento

		System.out.println(alunos.size());//o tamanho é 6 e não 7
		System.out.println(alunos);// observar que a ordem não foi garantida

		// alunos.get(4);isso não funciona, não tem ordem específica

		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		//ou
		alunos.forEach(aluno -> System.out.println(aluno));
		
		//aqui está uma grande vantagem do Set, velocidade em procurar um elemento
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		System.out.println(pauloEstaMatriculado);
		
		//posso fazer uma lista se precisar de uma característica desta
		List<String> alunosEmLista = new ArrayList<>(alunos);
		System.out.println(alunosEmLista);
		alunosEmLista.sort(null);
		
	}

}

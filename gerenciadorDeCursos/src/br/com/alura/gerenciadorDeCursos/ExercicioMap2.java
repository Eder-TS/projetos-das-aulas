package br.com.alura.gerenciadorDeCursos;

import java.util.*;
import java.util.Map.Entry;

public class ExercicioMap2 {

	public static void main(String[] args) {
		// Map<key,value>
		Map<String, Integer> nomesParaIdade = new HashMap<>();
		nomesParaIdade.put("Paulo", 31);
		nomesParaIdade.put("Adriano", 25);
		nomesParaIdade.put("Alberto", 33);
		nomesParaIdade.put("Guilherme", 26);
		
		//Como key = String, logo value() retorna a idade
		nomesParaIdade.values().forEach(idade -> System.out.println(idade));
		nomesParaIdade.keySet().forEach(nome -> System.out.println(nome));
		
		//Aqui retorna a associoção de idade e nome
		Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
		for (Entry<String, Integer> entry : associacoes) {
			System.out.println(entry);
		}
	}
}
	

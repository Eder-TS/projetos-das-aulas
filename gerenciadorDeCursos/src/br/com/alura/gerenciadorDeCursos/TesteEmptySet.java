package br.com.alura.gerenciadorDeCursos;

import java.util.*;

public class TesteEmptySet {

	public static void main(String[] args) {

		Set<String> nomes = Collections.emptySet();
		nomes.add("Paulo"); // o que acontece aqui?
	}

}

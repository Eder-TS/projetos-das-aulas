package br.com.alura.gerenciadorDeCursos;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteTreeSetEComparator {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Barnabé MC'Donald", 19);
		Funcionario f2 = new Funcionario("Chibas Fran", 67);
		Funcionario f3 = new Funcionario("Ari Toledo", 36);
		
		Set<Funcionario> funcionarios = new TreeSet<>();
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);
		
		Iterator<Funcionario> it = funcionarios.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getNome());
		}
	}

}

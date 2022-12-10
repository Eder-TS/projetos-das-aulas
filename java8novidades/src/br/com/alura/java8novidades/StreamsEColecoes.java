package br.com.alura.java8novidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.*;
public class StreamsEColecoes {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(comparing(Curso::getAlunos));//ordenando por número de alunos
		cursos.forEach(System.out::println);//Aqui o method reference retorna com o toString imprimindo as referências
		cursos.forEach(c -> System.out.println(c.getNome()));//Com lambda consigo definir melhor a saída
		
		System.out.println("--------------------------------");
		
		//Métodos de filtragem estão na interface stream
		//A vantagem do Stream é não alterar a coleção original pois
		//retorna um Stream com a ação desejada.
		cursos.stream().filter(c -> c.getAlunos() >= 100)//Para conseguir imprimir uso o forEach
			.forEach(c -> System.out.println("Mais de 100: " + c.getNome()));//dentro do próprio filtro
		
		//Caso queira apenas o número de alunos posso usar a interface map que devolve Integer
		cursos.stream().filter(c -> c.getAlunos() >= 100)
			.map(Curso::getAlunos).forEach(System.out::println);
		
		System.out.println("--------------------------------");
		
		//Outras posssibilidades...
		int soma = cursos.stream().filter(c -> c.getAlunos() >= 100)
		.mapToInt(Curso::getAlunos).sum();//Soma dos alunos dos cursos com mais de 100 alunos
		System.out.println(soma);
		
		Stream<String> nomesCursos = cursos.stream().map(Curso::getNome);//Um Stream só com os nomes
		nomesCursos.forEach(System.out::println);//porém não herda os métodos da classe Curso
		
		cursos.stream().map(Curso::getAlunos).forEach(System.out::println);
		//Stream de inteiros da quantidade de alunos de cada curso
		
		System.out.println("--------------------------------");
		
		//Retorna qualquer curso
		//Aqui, a API sugerida é a Classe Optional, que lida bem com null (desde que eu implemente os métodos)
		Optional<Curso> qualquerCurso = cursos.stream().filter(c -> c.getAlunos() >= 1000).findAny();
		qualquerCurso.ifPresent(c -> System.out.println(c.getNome()));
		//qualquerCurso pode ter retornado nulo, ifPresent verifica a exitência e executa o método ou
		//não faz nada se for nulo. 
		//Abaixo também é válido:
		cursos.stream().filter(c -> c.getAlunos() >= 100)
			.findAny().ifPresent(c -> System.out.println(c.getNome()));
		
		System.out.println("--------------------------------");
		
		//Quando quero o retorno do Stream numa coleção (lista, map...)
		//uso os collectors to... (toList, toMap...)
		List<Curso> listaCursos = cursos.stream()
				.filter(c -> c.getAlunos() >= 100).collect(Collectors.toList());
		//Isso também é válido, porém estou modificando meu objeto original
		cursos = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
				.collect(Collectors.toList());
		
		cursos.forEach(c -> System.out.println(c.getNome()));
		
		System.out.println("--------------------------------");
		
		cursos.stream()//faz um Stream de cursos
			.filter(c -> c.getAlunos() >= 100)//pega os cursos com mais de 100 alunos
			.collect(Collectors.toMap(//"constrói" um Map
					c -> c.getNome(),//com chave nome
					c -> c.getAlunos()))//e valor alunos
			.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos."));//e imprime um por vez
		
		//Outra melhoria é o parallelstream() para trabalhar com multi-thread
		//para o caso de um código que exigisse mais processamento
	
		//Retornando o primeiro
		Optional<Curso> exercicio1 = cursos.stream().filter(c -> c.getAlunos() >= 50).findFirst();
		//Retornando a média
		OptionalDouble exercicio2 = cursos.stream().mapToInt(Curso::getAlunos).average();
		System.out.println(exercicio2);
		//Transformar Stream em List
		Stream<Curso> stream = cursos.stream().filter(c -> c.getAlunos() > 50);//código original
		List<Curso> exercicio3 = cursos.stream()
									.filter(c -> c.getAlunos() > 50)
									.collect(Collectors.toList());
		
	}

}

package br.com.alura.gerenciadorDeCursos;

public class TestaAlunosMatriculados {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
		
		Aluno a1 = new Aluno ("Zunino Machado", 1373);
		Aluno a2 = new Aluno ("Jacó Trump", 3464);
		Aluno a3 = new Aluno ("Bilica da Ilha", 9839);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Quem é o aluno da matrícula 3464?");
		Aluno aluno = javaColecoes.buscaMatriculado(364);
		System.out.println(aluno);

	}

}

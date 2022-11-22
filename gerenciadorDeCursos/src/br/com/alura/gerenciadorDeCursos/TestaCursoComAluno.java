package br.com.alura.gerenciadorDeCursos;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
		
		Aluno a1 = new Aluno ("Zunino Machado", 1373);
		Aluno a2 = new Aluno ("Jacó Trump", 3464);
		Aluno a3 = new Aluno ("Bilica da Ilha", 9839);
		
		javaColecoes.matricula(a1);//com este método não á acesso ao conjunto de
		javaColecoes.matricula(a2);//alunos, mantendo o encapsulamento
		javaColecoes.matricula(a3);
		
		System.out.println("Alunos matriculados:");
		System.out.println(javaColecoes.getAlunos());//toString sobrescrito na classe Aluno
		javaColecoes.getAlunos().forEach(a -> System.out.println(a));
		//getAlunos funciona para mostrar, não para modificar
		Aluno a4 = new Aluno ("Tio Biriba", 88888);
		//javaColecoes.getAlunos().add(a4);//compila mas gera exception
		
		//Se quiser procurar um aluno matriculado:
		System.out.println(javaColecoes.estaMatriculado(a4));
		//System.out.println(javaColecoes.getAlunos().contains(a4));
		
		//Resolvendo o equals()
		System.out.println("O aluno " + a1 + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		//mas...
		//se implementar uma ferramenta de busca
		String nome = "Zunino Machado";//salvando o campo de busca numa String
		//javaColecoes.estaMatriculado(nome);isso não funciona no código construído pois
		//tenho um objeto Aluno, não String
		//então...
		Aluno zunino = new Aluno("Zunino Machado", 1373);//salvando o campo de busca num Aluno
		System.out.println("O aluno " + zunino + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(zunino));
		//Apesar de ambos serem iguais, não são o mesmo e as referências apontam 
		//para obetos diferentes.
		//O método contains() usa o equals() que acaba comparando para onde apontam as referências,
		//logoo temos que sobrescrever equals().
		System.out.println(a1.equals(zunino));//Aqui funciona após sobrescrita, porém
		System.out.println(javaColecoes.estaMatriculado(zunino));//aqui ainda não funciona
																//devido a característica da classe Set
																//ao fazer a tabela de espalhamento
		//Todos estão funcionando pois equals() e hashCode() foram sobrescritos.
		
	}

}

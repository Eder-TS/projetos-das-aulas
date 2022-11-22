package br.com.alura.gerenciadorDeCursos;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	//Ao fazer a tabela de espalhamento para um conjunto Set
	//são usados "números mágicos" para agrupamento e a busca é feita por este
	//"númers mágico". Portanto, para otimização da busca para o meu código é
	//preciso sobrescrever o método hashCode().
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	//Usando o Map para criar um relacionamento de busca com o número de matrícula
	//Map não é coleção
	
	public Curso(String nome, String instrutor) {
		if (nome == null) {//Garantindo no construtor que não haverá nome nulo.
			throw new NullPointerException("Nome não pode ser nulo.");
		}
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona (Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		
		//java8
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
		
		//maneira tradicional
//		int tempoTotal = 0;
//		for (Aula aula : aulas) {
//			tempoTotal += aula.getTempo();
//		}
//		return tempoTotal;
	}
	
	@Override
	public String toString() {
		return "[Curso: " + nome + ", tempo total: " + getTempoTotal() + " minutos.]";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
		//Usando o Map para criar um relacionamento de busca com o número de matrícula
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);//Delegando a maneira de busca para Collections 
	}

	public Aluno buscaMatriculado(int numero) {
		return matriculaParaAluno.get(numero);
		//Usando o Map para criar um relacionamento de busca com o número de matrícula
		//Deixando a relação abaixo obsoleta
//		for (Aluno aluno : alunos) {
//			if (aluno.getNumeroMatricula() == numero)
//				return aluno;
//		}
//		throw new NoSuchElementException("Matrícula não encontrada: " + numero);
	}
}

package br.com.alura.gerenciadorDeCursos;

public class Aluno {
	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro.nome);
	}//Quando sobrescrever equals(), também sobrescrever hashCode().
	// Ao fazer a tabela de espalhamento para um conjunto Set
	// são usados "números mágicos" para agrupamento e a busca é feita por este
	// "númers mágico". Portanto, para otimização da busca para o meu código é
	// preciso sobrescrever o método hashCode().
	@Override
	public int hashCode() {
		return this.nome.hashCode();//aqui classe String já tem um método para
		//gerar hashcode, então uso o mesmo para complementar o equals que
		//está comparando nomes de alunos.
	}

	@Override
	public String toString() {
		return this.nome + ", " + this.numeroMatricula;
	}
}

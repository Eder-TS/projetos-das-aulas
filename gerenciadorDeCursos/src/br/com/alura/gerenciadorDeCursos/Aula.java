package br.com.alura.gerenciadorDeCursos;

public class Aula implements Comparable<Aula>{
	
	private String titulo;
	private int tempo;
	private static int total;
	
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
		total += tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}
	
	@Override
	public String toString() {
		
		return "[Aula: " + titulo + ", " + tempo + " minutos]";
	}

	@Override
	public int compareTo(Aula aoutraAula) {
		return this.titulo.compareTo(aoutraAula.titulo);
	}
	
	public static int tempoTotalAulas() {
		return total;
	}

}

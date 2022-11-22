package br.com.alura.io.java.teste;

import java.io.IOException;
import java.io.PrintStream;

public class Teste3ManeirasDeEscrita {

	public static void main(String[] args) throws IOException {
		
									//aqui tamb��m funciona (new FileWriter("Lorem...
		PrintStream ps = new PrintStream("LoremEscrito.txt", "UTF-8");//classe anterior aos Writers
															//construtor bastante flex��vel
		//PrintWriter pw = new PrintWriter("LoremEscrito.txt");depois de criados os Writers
												//foi criada esta classe que n��o usa Stream
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor");
		ps.println();//n��o preciso usar para pular linha no final da escrita
		ps.println("ééééé çççççç @@@@ ããããã");

		ps.close();//n��o esquecer de fechar os recursos

	}

}

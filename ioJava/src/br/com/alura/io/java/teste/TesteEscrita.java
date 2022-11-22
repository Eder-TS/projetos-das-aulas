package br.com.alura.io.java.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		//Similar ao padrão de entrada é o padrão de saída
		OutputStream fos = new FileOutputStream("LoremEscrito.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor");
		bw.newLine();//para iniciar a escrita em uma nova linha
		bw.write("incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud");
		
		bw.close();
	}

}

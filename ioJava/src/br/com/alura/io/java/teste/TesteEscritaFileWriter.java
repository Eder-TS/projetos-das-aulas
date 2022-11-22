package br.com.alura.io.java.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

//		OutputStream fos = new FileOutputStream("LoremEscrito.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

		// código acima substituído por uma classe possa escrever caracter em arquivo
		FileWriter fw = new FileWriter("LoremEscrito.txt");

		fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor");
		// fw.newLine();este método não existe na classe FileWrite
		fw.write("\n");
		fw.write("\n");// esta maneira de pular linha não é correta de usar pois cada
		fw.write("\n");// sistema operacional tem um modo de fazer (\n ou \r\n etc)
		fw.write(System.lineSeparator());// modo mais adequado
		fw.write("incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud");

		fw.close();

		
		//posso melhorar o código ainda usando o BufferedWriter
		BufferedWriter novobw = new BufferedWriter( new FileWriter("LoremEscrito.txt"));

		novobw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor");
		novobw.newLine();//BufferedWriter tem este método para pular linha
		novobw.write("incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud");

		novobw.close();

	}

}

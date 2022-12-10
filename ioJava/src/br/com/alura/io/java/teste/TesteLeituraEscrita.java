package br.com.alura.io.java.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteLeituraEscrita {

	public static void main(String[] args) throws IOException {

		// InputStream teclado = System.in;teclado
		InputStream fis = new FileInputStream("Lorem.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		// OutputStream fos = new FileOutputStream("loremEscrito.docx");não funciona
		// assim para *.docx
		OutputStream fos = new FileOutputStream("LoremEscrito.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		String linha = br.readLine();
		while (linha != null) {

			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
		}

		br.close();
		bw.close();
		
		//lendo do teclado e escrevendo no arquivo txt
		InputStream teclado = System.in;//aqui posso instanciar um arquivo pois o laço de escrita é mais genérico
		Reader leitorEntrada = new InputStreamReader(teclado);
		BufferedReader bufLeitor = new BufferedReader(leitorEntrada);

		OutputStream arquivoSaida = System.out; //new FileOutputStream("LoremEscritoTeclado.txt");
		Writer escritor = new OutputStreamWriter(arquivoSaida);
		BufferedWriter bufEscritor = new BufferedWriter(escritor);

		String linhaEscrita = bufLeitor.readLine();
		while (linhaEscrita != null && !linhaEscrita.isEmpty()) {//este laço é mais genérico e
																//aceita entrada do teclado e do arquivo
			bufEscritor.write(linhaEscrita);					//também posso usar p saída console e arquivo
			bufEscritor.newLine();
			bufEscritor.flush();
			linhaEscrita = bufLeitor.readLine();
		}

		bufLeitor.close();
		bufEscritor.close();
		
		//Também existe uma classe para ler da rede e escrever na rede:
		Socket s = new Socket();//pacote java.net
		//o restante ficaria igual com o InputStream
		//Para escrever na rede bastaria usar o OutputStream, com buffer e writer
		s.close();
	}
}

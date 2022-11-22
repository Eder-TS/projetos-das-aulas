package br.com.alura.io.java.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		//Quero estabelecer um fluxo(Steram) de entrada(Input) para um arquivo(File)
		FileInputStream fis = new FileInputStream("Lorem.txt");//estabelecendo fluxo de entrada
		//InputStream fis = new FileInputStream("Lorem.txt")isso também funciona pois InputStream é a classe mãe
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");//transformando de bits para caractere
		//Reader isr = new InputStreamReader(fis);isso também funciona pois Reader é a classe mãe
		BufferedReader br = new BufferedReader(isr);//organizando os caracteres de uma forma legível
													//aqui gera um alarme se não fechar o buffer
		
		//código que lê uma linha
//		String linha = br.readLine();
//		System.out.println(linha);
//		br.close();
		
		//quero ler o texto todo
		String linha = br.readLine();
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		br.close();
	}

}

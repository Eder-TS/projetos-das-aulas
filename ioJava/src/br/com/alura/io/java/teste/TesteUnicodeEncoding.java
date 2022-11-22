package br.com.alura.io.java.teste;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEncoding {

	public static void main(String[] args) throws Exception {
		String c = "ç";
		System.out.println(c.codePointAt(0));//o índice é a posição do caractere na string
		String conta = "conta";
		System.out.println(conta.codePointAt(2));//n
		
		Charset charset = Charset.defaultCharset();//encoding do SO
		System.out.println(charset.displayName());
		
		byte[] bytes = c.getBytes("windows-1252");
		System.out.print(bytes.length + ", windows-1252, ");
		String decodingC = new String(bytes, "windows-1252");
		System.out.println(decodingC);
		
		bytes = c.getBytes("UTF-16");
		System.out.print(bytes.length + ", utf-16, ");
		decodingC = new String(bytes, "windows-1252");//é comum ter de tratar os dados do stream
		System.out.println(decodingC);//porém é preciso usar o charset correto, não como este
		
		bytes = c.getBytes(StandardCharsets.US_ASCII);
		System.out.print(bytes.length + ", US_ASCII, ");
		decodingC = new String(bytes, "windows-1252");
		System.out.println(decodingC);
		
		String s1 = "13º Órgão Oficial";
		byte[] exercicio = s1.getBytes();
		String s2 = new String(exercicio, "UTF-8");
		System.out.println(s2);//deu certo pois lá em cima está setado o charset

	}

}

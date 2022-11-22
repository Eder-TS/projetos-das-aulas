package br.com.bytebank.banco.test;

public class TestaArrayString {

	//posso passar parâmetros (argumentos) para a classe através do array da declaração
	public static void main(String[] args) {
		System.out.println("Funciona!");
		
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}

	}

}

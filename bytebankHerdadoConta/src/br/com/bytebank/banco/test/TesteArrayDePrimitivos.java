package br.com.bytebank.banco.test;

public class TesteArrayDePrimitivos {
	//Array[]
	public static void main(String[] args) {
		int[] idades = new int[5];//inicializa com valores padrão (zero) 

		idades[0] = 90;
		idades[1] = 13;
		idades[2] = 56;
		idades[3] = 1;
		idades[4] = 26;
		
		System.out.println(idades[0]);
		//ou
		int idade3 = idades[2];
		System.out.println(idade3);
		
		//int idade2 = idades[20];gera uma exceção pois o ídice é maior que o comprimento do array
		
		System.out.println(idades.length);
		
		int[] favelas = new int[10];
		//inicializando array com for
		for(int i = 0; i < favelas.length; i++) {
			favelas[i] = i * 3;
		}
		
		for(int i = 0; i < favelas.length; i++) {
			System.out.println(favelas[i]);
		}
	}

}

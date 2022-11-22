package sintaxevariaveisefluxo;

public class testaConversao {
	public static void main(String[] args) {
		double salario = 1250.70;
		int valor = (int)salario;
		System.out.println("Resultado do 'casting': " + valor);
		
		//int overFlow = 20000000000; ultrapassou o tamanho máximo para inteiro
		long valorGrande = 9999999999L;//para aceitar como inteiro long é preciso adicionar L no final do número
		short valorPequeno = 9999; //apenas valores pequenos 16bits -1
		byte extraPequeno = 127; //valor máximo é 127
		
		double valor1 = 0.1;
		double valor2 = 0.2;
		double total = valor1 + valor2;
		System.out.println("Resutado bizonho (há expliação na internet):" + total);
		
		//float pi = 3.14; isto não funciona pois 3.14 é double(64bits), float é 32bits
		float pi = 3.14f; //utilizando o f o compilador interpreta da forma literal como sendo float
	}
}

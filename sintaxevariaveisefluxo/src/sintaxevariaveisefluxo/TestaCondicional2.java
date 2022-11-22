package sintaxevariaveisefluxo;

public class TestaCondicional2 {
	public static void main(String[] args) {
		int idade = 16;
		int quantidadePessoas = 2;
		
		if (idade >= 18 || quantidadePessoas >= 2) {//em Java é possível não usar as chaves quando há apenas uma instrução
			System.out.println("Você pode entrar.");//porém não é recomendado
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Infelimente você não pode entrar.");
		}
		
		//boolean acompanhado = quantidadePessoas >= 2; Java também aceita expressões para definir valor boleano
		boolean acompanhado = true;
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Você pode entrar.");
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Infelimente você não pode entrar.");
		}
	}
}

package sintaxevariaveisefluxo;

public class TestaCondicional {
	public static void main(String[] args) {
		int idade = 20;
		int quantidadePessoas = 1;
		if (idade >= 18) {//em Java é possível não usar as chaves quando há apenas uma instrução
			System.out.println("Você tem mais de 18 anos.");//porém a prática não é recomendada
		} else if(quantidadePessoas >= 2){
			System.out.println("Você pode entrar pois está acompanhando.");
		} else {
			System.out.println("Infelimente você não pode entrar.");
		}
	}
}

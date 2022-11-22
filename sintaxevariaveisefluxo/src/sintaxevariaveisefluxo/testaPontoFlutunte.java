package sintaxevariaveisefluxo;

public class testaPontoFlutunte {
	public static void main(String[] args) {
		double salario;
		salario = 1250.70;
		System.out.println("O meu salário é "+ salario +" reais.");
		
		double divisao = 3.1415 / 2;
		System.out.println(divisao);
		
		int outraDivisao = 5 / 2;
		System.out.println("Resultado truncado: "+ outraDivisao);
		
		double novaTentativa = 5 / 2;
		System.out.println("Executou divisão de dois inteiros e o resultado foi inteiro: "+ novaTentativa);
		
		double divisaoCorreta = 5.0 / 2;
		System.out.println("Considerou o tipo double 'mais importante': "+ divisaoCorreta);
	}
}

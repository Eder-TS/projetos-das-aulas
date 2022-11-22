package javapilha;

public class TesteContaExcecao {
	public static void main(String[] args) {
		
		Conta c = new Conta();
		try {
			c.deposita();//aqui já não compila pois o método chamado tem uma exceção do tipo 
					//checked 
					//preciso tratar a exceção com try/catch ou colocar um throws na assinatura desta
					//classe  e quem chamar esta classe vai ter que lidar com a exceção
		} catch(MinhaExcecaoNovoTeste ex) {
			System.out.println("Fazer algo");
		}
	}
}

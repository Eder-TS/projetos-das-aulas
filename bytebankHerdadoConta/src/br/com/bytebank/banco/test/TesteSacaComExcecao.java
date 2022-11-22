package br.com.bytebank.banco.test;

//aqui foram imprtadas as classes específicas, o que geralmente é melhor 
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSacaComExcecao {

	public static void main(String[] args) {
		Conta c = new ContaCorrente(23, 30);
		c.deposita(300.00);

		//c.saca(200);

		System.out.println(c.getSaldo());
		try {
			c.saca(400.0);
		} catch (Exception ex) {
			System.out.println("Ex: " + ex.getMessage());
		}
		
		System.out.println(c.getSaldo());
	}

}

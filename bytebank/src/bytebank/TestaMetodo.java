package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);
		
		boolean conseguiuRetirar = contaDoPaulo.saca(100);
		System.out.println("Conseguiu retirar: " + conseguiuRetirar);
		System.out.println(contaDoPaulo.saldo);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		System.out.println(contaDaMarcela.saldo);
		
		contaDaMarcela.transfere(contaDaMarcela, 300, contaDoPaulo);
		System.out.println("Saldo Paulo: " + contaDoPaulo.saldo);
		System.out.println("Saldo Marcela: " + contaDaMarcela.saldo);
		
		if(contaDaMarcela.transfere(contaDaMarcela, 300, contaDoPaulo)) {
			System.out.println("Transferência realizada com sucesso.");
		} else {
			System.out.println("Não há saldo suficiente");
		}
		
		contaDoPaulo.titular = "Paulo Silveira";
		System.out.println(contaDoPaulo.titular);
	}
}

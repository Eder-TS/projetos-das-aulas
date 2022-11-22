package bytebankEncapsulado;

public class TestaValores {
	public static void main(String[] args) {
		//suponhando que a regra de negócio não permita conta e agência <= 0
		Conta conta = new Conta(1337, 42);//para o código já reescrito
		//saldo está protegido
		conta.deposita(-100);
		
		//aqui agência e número estão protegidos na atribuição de valores
		conta.setAgencia(-94738);//mas quando a conta é criada os valores são
		conta.setNumero(-92);//zero por padrão
		
		
	}
}

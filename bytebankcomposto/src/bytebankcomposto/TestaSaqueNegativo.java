package bytebankcomposto;

public class TestaSaqueNegativo {
	public static void main(String[] args) {
		//suponhamos que no nosso modelo de negócio nao seja permitido saldo negativo
		Conta conta = new Conta(); //é normal usar nomes de variáveis temporárias iguais aos nomes das classes
		
		//todo o código abaixo foi comentado pois o atributo saldo da classe
		//Conta foi definido como private para evitar acessos diretos
		/*conta.saldo = 100;
		
		System.out.println(conta.saca(200));//o método saca não permite saque maior que saldo
		System.out.println(conta.saldo);
		
		conta.deposita(-200);//o método deposita não controla o saldo e permite valor negativo
		System.out.println(conta.saldo + " saldo negativo!!");
		
		conta.saldo = 100;
		conta.saldo = conta.saldo - 200;//aqui o atributo está sendo acessado fora do método saca
		//falta encapsulamento e queremos que o comportamento anterior sea proibido
		System.out.println(conta.saldo + " saldo negativo!!");*/
		
		//agora foi implementado o método getSaldo dentro da classe Conta, criando o encapsulamento
		System.out.println(conta.getSaldo());
	}
}

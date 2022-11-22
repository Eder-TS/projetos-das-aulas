package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.0;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Primeira conta tem: " + primeiraConta.saldo);
		System.out.println("Segunda conta tem: " + segundaConta.saldo);
		
		System.out.println("Primeira conta agência: " + primeiraConta.agencia);
		System.out.println("Segunda conta agência: " + segundaConta.agencia);
		
		segundaConta.agencia = 884;
		System.out.println("Agora segunda conta agência: " + segundaConta.agencia);
		
		if (primeiraConta == segundaConta) {
			System.out.println("são  mesma conta");
		} else {
			System.out.println("são contas diferentes");
		}
	}
}

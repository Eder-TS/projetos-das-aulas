package bytebankEncapsulado;

public class TestaVariavelStatic {
	public static void main(String[] args) {
		Conta conta1 = new Conta(1337, 49);
		//Conta.total;
		
		Conta conta2 = new Conta(1337, -50);
		
		
		Conta conta3 = new Conta(1337, 51);
	
		//invocando o método fora do construtor
		System.out.println(conta2.getTotal());//só existe um valor, mas já não é correto usar
		
		System.out.println(Conta.getTotal());//funciona pois foi delcarado método static
	}
}

package bytebank;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 452;
		
		System.out.println("primeira conta " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;//está apenas guardando a referência da primeira na segunda
											//ambas apontam para o mesmo objeto
		System.out.println("segunda conta " + segundaConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("são  mesma conta");
		}
	}
}

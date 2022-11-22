package bytebankherdado;

public class SistemaInterno {
	private int senha = 2222;
	
	public void autentica(Autenticavel a) {
		boolean autenticou = a.autenticaSenha(this.senha);
		
		if (autenticou) {
			System.out.println("Pode entrar.");
		} else {
			System.out.println("Não pode entrar.");
		}
	}
}

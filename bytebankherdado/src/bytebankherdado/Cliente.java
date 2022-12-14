package bytebankherdado;

public class Cliente implements Autenticavel {

	private AutenticacaoUtil autenticador;//para a composição
	
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public boolean autenticaSenha(int senha) {
		return this.autenticador.autenticaSenha(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

}

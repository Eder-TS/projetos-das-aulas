package bytebankherdado;

public class Administrador extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;//para a composição
	
	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do Adminisrador.");
		return super.getSalario() + 500;
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

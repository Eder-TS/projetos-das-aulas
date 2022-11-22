package bytebankherdado;
//classe criada para aplicar a composição que 
//substitui a reutilizazção de código da herança
public class AutenticacaoUtil {
	
	private int senha;

	public boolean autenticaSenha(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

}

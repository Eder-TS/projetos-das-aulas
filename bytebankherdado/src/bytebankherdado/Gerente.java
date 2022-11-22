package bytebankherdado;

//classe Gerente herda da classe Funcionario, assina contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;//para a composição
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
//	public double getBonificacao() {//este método leva a mesma assinatura do método similar na classe mãe
//		return super.salario; //aqui é usada a palavra-chave super
//	}//para indicar que o atributo salario vem da classe mãe

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do Gerente.");
		return super.getSalario();
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

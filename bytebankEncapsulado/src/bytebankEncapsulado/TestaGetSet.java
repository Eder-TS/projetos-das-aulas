package bytebankEncapsulado;

public class TestaGetSet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 42);
		
		System.out.println("Número da nova conta: " + conta.getNumero());
		//System.out.println("Número da nova conta: " + conta.numero); isto não funciona mais
	
		Cliente paulo = new Cliente();
		//conta.titular = paulo; isso não funciona mais pois o titular é privado
		
		//paulo.nome = "Paulo Silveira"; isso também não funciona mais
		paulo.setNome("Paulo Silveira");
		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getNome());
		
		//para atualizar campo do cliente:
		conta.getTitular().setProfissao("programador");
		System.out.println(conta.getTitular().getProfissao());
		paulo.setProfissao("pedreiro");
		System.out.println(conta.getTitular().getProfissao());
		//dois caminhos para o mesmo atributo
		
		Cliente titularDaConta = conta.getTitular();
		System.out.println(titularDaConta);
		System.out.println(paulo);//os três aponta para o mesmo "local"
		System.out.println(conta.getTitular());
		
		conta.deposita(-10);
	}
}

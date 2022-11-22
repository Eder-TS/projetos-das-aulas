package bytebankherdado;

public class TesteGerente {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		
		g1.setNome("Zé");//métodos herdados de Funcionario
		g1.setCpf("23456789-0");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		//g1.setSenha(7777);
		//boolean autenticou = g1.autenticaSenha(7777);
		//System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
	}
}

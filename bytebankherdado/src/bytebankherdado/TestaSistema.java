package bytebankherdado;

public class TestaSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		
		Designer d = new Designer();
		//si.autentica(d);nao funciona pois Designer herda de Funcionario
						//este método está apenas na classe FuncionarioAutenticavel	
		
		Administrador ad = new Administrador();
		ad.setSenha(2222);
		
		si.autentica(ad);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(2228);
		
		si.autentica(cliente);
		
		Autenticavel g2 = new Gerente();//agora que temos a interface Autenticavel
		g2.setSenha(2222);				//temos também um novo tipo de referência
	
		si.autentica(g2);
		
	}

}

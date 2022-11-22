package bytebankherdado;

public class TesteReferencias {

	public static void main(String[] args) {
		Funcionario g1 = new Gerente();//isso funciona pois Funcionario é uma referência mais genérica
		//o contrário não funciona
		g1.setSalario(5000.0);
		//boolean autenticou = g1.autenticaSenha(8888);//nao compila pois este método
		//no está definido na referência Funcionario, porém o 
		//objeto continua sendo do tipo Gerente
		
		Funcionario ev = new EditorVideo();
		ev.setSalario(2000);
		
//		Funcionario fu = new Funcionario();//isso não funciona mais pois
//		fu.setSalario(2000);				//a classe Funcionario é abstract
		
		Funcionario des = new Designer();
		des.setSalario(2300.0);
		
		//aqui graças ao polimorfismo o método funciona para todos os objetos filhos
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(des);
		//controle.registra(fu);
		
		System.out.println(controle.getSoma());
		
		
	}
}

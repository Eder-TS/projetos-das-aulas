package bytebankcomposto;

public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.getSaldo());
		
		System.out.println(contaDaMarcela.titular);
		
		//contaDaMarcela.titular.nome = "Marcela";//não cria o cliente e nem a referência mas compila e gera erro
		//System.out.println(contaDaMarcela.titular.nome);//gera erro
		
		contaDaMarcela.titular = new Cliente();//posso criar o objeto cliente atribuindo ao objeto conta
		//não precisa da variável temporária "marcela" do tipo Cliente
		contaDaMarcela.titular.nome = "Marcela Fumo";//agora funciona
		System.out.println(contaDaMarcela.titular);
		System.out.println(contaDaMarcela.titular.nome);
	}
}

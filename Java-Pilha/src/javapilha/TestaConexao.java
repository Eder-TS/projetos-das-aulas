package javapilha;

public class TestaConexao {

	public static void main(String[] args) {
//		try {
//		Conexao con = new Conexao();
//		con.leDados();
//		con.fecha();
//		}catch(IllegalStateException ex) {
//			System.out.println("Erro de conexão");
//		}//se fosse um código de protocolo de conexão
		// a conexão não teria sido fechada em caso de exceção
		// o que poderia causar problema para o SO

//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//			con.fecha();
//		} catch (IllegalStateException ex) {
//			System.out.println("Erro de conexão");
//			con.fecha();
//		}//aqui a conexão é fechada em caso de exceção mas
		//o código já não está "cheirando bem"
		
		Conexao con = null;
		try {
			con = new Conexao();
			con.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Erro de conexão");
		}finally {//aqui o finally garante que a última parte do código seja
			con.fecha();//sempre executada
		}
		
		
		//opcionalmente posso não ter nenhum catch, não tratar a exceção mas
		//então terei de usar o finally
		Conexao cone = null;
		try {
			cone = new Conexao();
			cone.leDados();
		} finally {
			cone.fecha();
		}

	}

}

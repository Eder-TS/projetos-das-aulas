package javapilha;

public class TesteExcecaoConstrutor {
	public static void main(String[] args) {

		// este código compila, porém vai gerar exceção NullPointer ao fechar a conexão
		// (con.fecha())
		// pois a exceção está sendo jogada pelo construtor
		ConexaoExcecaoNoConstrutor con = null;
		try {
			con = new ConexaoExcecaoNoConstrutor();
			con.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Erro conexão");
		} finally {
			// aqui gera exceção NullPointer
			// pois a conexão não foi aberta, construtor não executou
			con.close();//aqui o método foi mudado na classe ConexaoExce...
		}

	}
}

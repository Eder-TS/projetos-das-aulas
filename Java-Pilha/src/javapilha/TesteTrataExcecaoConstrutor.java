package javapilha;

public class TesteTrataExcecaoConstrutor {
	public static void main(String[] args) {

		// aqui podemos melhorar o código apenas com o intuito de evitar possíveis
		// exceções
		//código de uma aplicaçao simples ficando complexo apenas para tratar exceções
		ConexaoExcecaoNoConstrutor cone = null;
		try {
			cone = new ConexaoExcecaoNoConstrutor();
			cone.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Erro conexão");
		} finally {
			//if incluído apenas para evitar NullPointer
			if (cone != null) {
				//cone.fecha();//aqui o método foi mudado na classe ConexaoExce...
			}
			System.out.println("Finally");
		}
		
		
		//com a interface usada na classe TesteExce... o try/catch fica
		//simplificado e o finally é implícito
		//executando este código sem causar a exceção, a conexão é fechada normalmente
		try (ConexaoExcecaoNoConstrutor conexao = new ConexaoExcecaoNoConstrutor()){
			conexao.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Erro conexão novo try");
		}
		
		
	}
}

package javapilha;

//aqui usa-se uma interface para implementar um método que
//fecha a conexão de forma segura
//na classe TesteTrataExcecaoConstrutor o código poderá ser melhorado
public class ConexaoExcecaoNoConstrutor implements AutoCloseable{

    public ConexaoExcecaoNoConstrutor() {
        System.out.println("Abrindo conexao");
        //throw new IllegalStateException();
    }

    public void leDados() {
        System.out.println("Recebendo dados");
            
    }

//    public void fecha() {
//        System.out.println("Fechando conexao");
//    }

	@Override
	public void close() {
		System.out.println("Fechando conexao");
		
	}
}

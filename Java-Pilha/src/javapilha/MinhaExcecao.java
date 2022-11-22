package javapilha;

public class MinhaExcecao extends RuntimeException {
//criei minha própria exceção para poder jogá-la na pilha
	public MinhaExcecao(String msg) {
		super(msg);
	}
}

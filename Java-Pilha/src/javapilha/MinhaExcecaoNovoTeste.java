package javapilha;

public class MinhaExcecaoNovoTeste extends Exception {//checked
//criei minha própria exceção para poder jogá-la na pilha
	public MinhaExcecaoNovoTeste(String msg) {
		super(msg);
	}
}

package loja.pedido.acao;

import loja.pedido.Pedido;

public class EnviarEmailPedido implements AcoesAposGerarPedido {

	public void executarAcao(Pedido pedido) {
		System.out.println("Envia email com o pedido.");
	}
}

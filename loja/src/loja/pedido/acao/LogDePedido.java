package loja.pedido.acao;

import loja.pedido.Pedido;

public class LogDePedido implements AcoesAposGerarPedido {

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Log: Pedido foi gerado." + pedido);
	}

}

package loja.pedido.acao;

import loja.pedido.Pedido;

public class EnviarPedidoParaBancoDeDados implements AcoesAposGerarPedido {

	public void executarAcao(Pedido pedido) {
		System.out.println("Envia dados do pedido para o Banco de Dados.");
	}
}

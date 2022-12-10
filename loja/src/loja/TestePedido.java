package loja;

import java.math.BigDecimal;
import java.util.Arrays;

import loja.pedido.GeraPedido;
import loja.pedido.GeraPedidoHandler;
import loja.pedido.acao.EnviarEmailPedido;
import loja.pedido.acao.EnviarPedidoParaBancoDeDados;
import loja.pedido.acao.LogDePedido;

public class TestePedido {

	public static void main(String[] args) {
		String cliente = "Zé"; //args[0];
		BigDecimal valorOrcamento= new BigDecimal("300"); //args[1]);
		int quantidadeItens = Integer.parseInt("2"); //args[2]);
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
									Arrays.asList(
											new EnviarEmailPedido(),
											new EnviarPedidoParaBancoDeDados(),
											new LogDePedido()));
		handler.execute(gerador);
	}

}
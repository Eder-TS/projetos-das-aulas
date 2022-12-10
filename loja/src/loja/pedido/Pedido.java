package loja.pedido;

import java.time.LocalDate;

import loja.orcamento.Orcamento;

public class Pedido {

	private String cliente;
	private LocalDate data;
	private Orcamento orcamento;
	
	public Pedido(String cliente, LocalDate data, Orcamento orcamento) {
		this.cliente = cliente;
		this.data = data;
		this.orcamento = orcamento;
	}

	public String getCliente() {
		return cliente;
	}

	public LocalDate getData() {
		return data;
	}

	public Orcamento getOrcamento() {
		return orcamento;
	}

	
}

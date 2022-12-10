package loja.pedido;

import java.time.LocalDate;
import java.util.List;

import loja.orcamento.Orcamento;
import loja.pedido.acao.AcoesAposGerarPedido;

public class GeraPedidoHandler {

	private List<AcoesAposGerarPedido> acoes;
	
	//Construtor com injeção de dependências foi substituído por um que apenas chama 
	//uma lista do tipo da interface
	public GeraPedidoHandler(List<AcoesAposGerarPedido> acoes) {
		this.acoes = acoes;
	}
	
	//Aqui cada ação é executada através do um for.
	//Também é aplicado o pattern Facade.
	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento();
		Pedido pedido = new Pedido(dados.getCliente(), LocalDate.now(), orcamento);	
		
		//Implementação do design pattern Observer
		acoes.forEach(a -> a.executarAcao(pedido));
		//Aqui indiretamente foi aplicado o pattern Facade
		//que implementa uma 'fachada" para o cliente
		//e este executa apenas uma ação, mas por trás da fachada
		//várias ações podem ocorrer.
	}

	
}

package loja.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import loja.situacao.EmAnalise;
import loja.situacao.Finalizado;
import loja.situacao.SituacaoOrcamento;

public class Orcamento implements Orcavel {

	private BigDecimal valor;
	private SituacaoOrcamento situacao;
	private List<Orcavel> itens;
	
	public Orcamento() {
		this.valor = BigDecimal.ZERO;
		this.itens = new ArrayList<>();
		this.situacao = new EmAnalise();
	}

	public void aplicarDescontoExtra() {
		BigDecimal descontoExtra = this.situacao.calcularDescontoExtra(this);
		this.valor = this.valor.subtract(descontoExtra);
	}
	
	public void aprovar() {
		this.situacao.aprovar(this);
	}
	
	public void reprovar() {
		this.situacao.reprovar(this);
	}
	
	public void finalizar() {
		this.situacao.finalizar(this);
	}
	
	//Adicionado atraso para justificar aplicação do pattern Proxy
	//Demora em API de terceiro.
	public BigDecimal getValor() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		return valor;
	}
	
	public int getQuantidadeItens() {
		return itens.size();
	}

	public SituacaoOrcamento getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}

	//Aplicando o pattern Adapter
	public boolean isFinalizado() {
		return situacao instanceof Finalizado;
	}
	
	//Aplicando o pattern Composite
	public void adicionarItem(Orcavel item) {
		this.valor = valor.add(item.getValor());
		this.itens.add(item);
	}
}

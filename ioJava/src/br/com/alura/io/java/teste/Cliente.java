package br.com.alura.io.java.teste;

import java.io.Serializable;

/**
 * @param <Endereco>
 * @param <Endereco>
 * Classe que representa o cliente no Bytebank
 * 
 * @author Eder TS
 * posso usar esta sintaxe @ para melhor clareza
 * @version 
 * @category
 */
public class Cliente implements Serializable {
	/**
	 * 
	 */
	//o número da classe deve ser igual nos objetos criados para podermos ler na desseriaizaçao
	private static final long serialVersionUID = 6758361069817326485L;
	//O UID de serialização é o meio que o Java usa para marcar os objetos criados e depois 
	//conferir na desserialização para verificar se o objeto o mesmo da classe.
	//Pode auxiliar no versionamento, quando se altera a classe de forma significativa o UID
	//também deve mudar.
	
	private String nome;
	private String cpf;
	private String profissao;
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return this.profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
}

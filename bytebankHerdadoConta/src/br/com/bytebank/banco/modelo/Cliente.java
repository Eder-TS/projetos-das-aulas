package br.com.bytebank.banco.modelo;

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

package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado {

	// Classe DadosPessoais criada para se benficiar do conceito de composição
	// e permitir que Terceirizado também receba DadosPessoais
	// sem que receba métodos desnecessários de Funcionario.
	private DadosPessoais dadosPessoais;
	private String empresa;

	public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.setDadosPessoais(new DadosPessoais(nome, cpf, cargo, salario));
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}

}

package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

	//Classe DadosPessoais criada para se benficiar do conceito de composição
	//e permitir que Terceirizado também receba DadosPessoais
	//sem que receba métodos desnecessários de Funcionario.
	private DadosPessoais dadosPessoais;
	private LocalDate dataUltimoReajuste;

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
	}

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}

	//Método refatorado para uma nova classe
	//tornando esta classe mais específica
	//Reajuste ficou numa classe específica e agora é extensível.
	public void atualizarSalario(BigDecimal novoSalario) {
		this.dadosPessoais.setSalario(novoSalario);
		this.dataUltimoReajuste = LocalDate.now();
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	public void promove(Cargo novoCargo) {
		this.dadosPessoais.setCargo(novoCargo);
	}

}

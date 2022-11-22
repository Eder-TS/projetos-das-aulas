package br.com.alura.tdd.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Funcionario {

	private String nome;
	private LocalDate dataAdmissao;
	private BigDecimal salario;

	public Funcionario(String nome, LocalDate dataAdmissao, BigDecimal salario) {
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public BigDecimal getSalario() {
		return salario;
	}
	
	public void reajustarSalario(BigDecimal reajuste) {
		this.salario = this.salario.add(reajuste);
		arredondarSalario();
	}
	
	//O método abaixo foi criado para ter o arredondamento de salário
	//disponível para outros métodos, porém ele é privado, pois não é
	//chamado fora da classe. O que pode acontecer é eu querer testar este método e
	//torná-lo público, o que é má prática. O que tenho que observar é que 
	//este método é chamado por outro método publico dentro da classe então, 
	//quando testar aquele método, este aqui també será tetado.
	private void arredondarSalario() {
		this.salario = this.salario.setScale(2, RoundingMode.HALF_UP);
	}
	
	

}

package br.com.alura.tdd.modelo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


//Esta classe foi criada apenas para executar o teste com JUnit 
public class CalculadoraTest {
	
	//Esta anotação serve para "chamar" o JUnit
	@Test
	public void deveSomarDoisPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 7);
		//A saída não precisa ser no console, uso o aba JUnit para
		//avaliar o desempenho da aplicação.
		
		//Usando as classes e métodos do JUnit posso especificar o resultado esperado
		Assert.assertEquals(10, soma);
	}
}

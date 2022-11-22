package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

//Método de criação de cógido TDD
//feito a partir dos testes
public class ReajusteServiceTest {
	@Test
	public void reajusteTresPorCentoQuandoDesempenhoADesejar() {
		
		//Criação de instanciação da classe a partir da regra de negócio 
		ReajusteService service = new ReajusteService();
		
		//Instanciação de Funcionario para usar o salário do mesmo
		Funcionario funcionario = new Funcionario("Grafunda", LocalDate.now(), new BigDecimal("2000.00"));
		
		//Aplicação do suposto método "concederReajuste" ao objeto service
		service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
		
		assertEquals(new BigDecimal("2060.00"), funcionario.getSalario());
	}
	
	@Test
	public void reajusteQuinzePorCentoQuandoDesempenhoBom() {
		 
		ReajusteService service = new ReajusteService();
		
		Funcionario funcionario = new Funcionario("Grafunda", LocalDate.now(), new BigDecimal("2000.00"));
		
		service.concederReajuste(funcionario, Desempenho.BOM);
		
		assertEquals(new BigDecimal("2300.00"), funcionario.getSalario());
	}
	
	@Test
	public void reajusteVintePorCentoQuandoDesempenhoOtimo() {
		 
		ReajusteService service = new ReajusteService();
		
		Funcionario funcionario = new Funcionario("Grafunda", LocalDate.now(), new BigDecimal("2000.00"));
		
		service.concederReajuste(funcionario, Desempenho.OTIMO);
		
		assertEquals(new BigDecimal("2400.00"), funcionario.getSalario());
	}
}

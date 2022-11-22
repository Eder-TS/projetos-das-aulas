package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceRefatoradoTest {
	private ReajusteService service;
	private Funcionario funcionario;

	//Para o código não ficar repetitivo, uso a notação @BeforeEach no método
	//inicializar() para indicar ao JUnit que este método deve ser executado
	//antes de cada método de teste.
	//Existem outras anotações importantes como @AfterEach, @BeforeAll e @AfterAll. Estes
	//dois últimos os métodos devem ser estáticos.
	@BeforeEach
	public void inicializar() {
		this.service = new ReajusteService();
		this.funcionario = new Funcionario("Grafunda", LocalDate.now(), new BigDecimal("2000.00"));
	}

	@Test
	public void reajusteTresPorCentoQuandoDesempenhoADesejar() {
		service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("2060.00"), funcionario.getSalario());
	}

	@Test
	public void reajusteQuinzePorCentoQuandoDesempenhoBom() {
		service.concederReajuste(funcionario, Desempenho.BOM);
		assertEquals(new BigDecimal("2300.00"), funcionario.getSalario());
	}

	@Test
	public void reajusteVintePorCentoQuandoDesempenhoOtimo() {
		service.concederReajuste(funcionario, Desempenho.OTIMO);
		assertEquals(new BigDecimal("2400.00"), funcionario.getSalario());
	}
}

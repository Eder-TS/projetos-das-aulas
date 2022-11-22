package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceRefatoradoTest {
	
	private BonusService service;

	//Para o código não ficar repetitivo, uso a notação @BeforeEach no método
	//inicializar() para indicar ao JUnit que este método deve ser executado
	//antes de cada método de teste.
	//Existem outras anotações importantes como @AfterEach, @BeforeAll e @AfterAll. Estes
	//dois últimos os métodos devem ser estáticos.
	@BeforeEach
	public void inicializar() {
		this.service = new BonusService();
	}
	
	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		assertThrows(IllegalArgumentException.class,
				() -> service.calcularBonus(new Funcionario("Judas", LocalDate.of(0032, 12, 25), new BigDecimal("12000.00"))));
	}

	@Test
	void bonusDeveriaSerDezPorcentoDoSalario() {
		BigDecimal bonus = service.calcularBonus(new Funcionario("Judas", LocalDate.of(0032, 12, 25), new BigDecimal("9000.00")));
		assertEquals(new BigDecimal("900.00"), bonus);
	}
	
	@Test
	void bonusDeveriaSerMilReais() {
		BigDecimal bonus = service.calcularBonus(new Funcionario("Judas", LocalDate.of(0032, 12, 25), new BigDecimal("10000.00")));
		assertEquals(new BigDecimal("1000.00"), bonus);
	}
}

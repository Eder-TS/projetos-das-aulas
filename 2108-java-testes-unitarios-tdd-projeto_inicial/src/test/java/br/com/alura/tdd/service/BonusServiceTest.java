package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.alura.tdd.modelo.Funcionario;

//A classe de teste no JUnit é implementada com o mesmo nome da classe a ser testada
//acrescido de Test no final.
//Os métodos da classe de teste são a implementação dos métodos originais para cada situação a
//ser testada, por exemplo um salário mais alto, outro baixo e outro igual ao valor de
//decisão do código.
class BonusServiceTest {
	
	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService service = new BonusService();
		//Esta é a maneira de o JUnit verificar se o código está jogando uma exception
		assertThrows(IllegalArgumentException.class,
				() -> service.calcularBonus(new Funcionario("Judas", LocalDate.of(0032, 12, 25), new BigDecimal("12000.00"))));
		//Foi declarada uma lambda para servir como argumento de assertThrows
		
		//Foi removido o assertEquals pois a regra de negócio diz que um salário maior que 10k não
		//pode receber bônus, ou seja o retorno não é bônus igual a zero, o retorno é uma 
		//exception pois aquele funcionário não pode estar sujeito ao cálculo de bônus.
		
		//Outra maneira de testar a exception é usar o try/catch
		try {
			service.calcularBonus(new Funcionario("Judas", LocalDate.of(0032, 12, 25), new BigDecimal("12000.00")));
			//Aqui, depois do código a verificar, posso lançar um método de falha do JUnit
			fail("Não ocorreu a exception!");
		} catch (Exception e) {
			//Aqui posso tratar ou não, como por exemplo saber se estou recebendo a mensagem correta.
			assertEquals("Funcionário com salário maior que 10 mil reais não pode receber bônus!", e.getMessage());
			
		}
		
	}

	@Test
	void bonusDeveriaSerDezPorcentoDoSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Judas", LocalDate.of(0032, 12, 25), new BigDecimal("9000.00")));
		
		assertEquals(new BigDecimal("900.00"), bonus);
	}
	
	@Test
	void bonusDeveriaSerMilReais() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Judas", LocalDate.of(0032, 12, 25), new BigDecimal("10000.00")));
		
		assertEquals(new BigDecimal("1000.00"), bonus);
	}
}

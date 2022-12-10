package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ValidacaoIntervaloDeReajuste implements ValidacaoReajuste {

	public void validar(Funcionario funcionario, BigDecimal aumento) {
		LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
		LocalDate dataAtual = LocalDate.now();
		long mesesDesdeUltimoRajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
		if (mesesDesdeUltimoRajuste < 0) {
			throw new ValidacaoException("Intervalo entre reajustes deve ser maior que seis meses.");
		}
	}
}

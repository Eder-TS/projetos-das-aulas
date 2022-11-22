package br.com.bytebank.banco.modelo;

public class SeguroDeVida implements Tributavel {

	@Override
	public double getValorImposto() {
		return 42;
	}//implementação do contrato com a interface

}

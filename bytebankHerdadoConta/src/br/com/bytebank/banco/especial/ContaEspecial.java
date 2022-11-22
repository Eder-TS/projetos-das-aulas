package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;

public class ContaEspecial extends Conta {

	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;//o atributo saldo da classe Conta só está visível neste pacote
							//pois o atributo saldo foi definido como protected e
							//esta classe ContaEspecial é filha da classe Conta
	}

}

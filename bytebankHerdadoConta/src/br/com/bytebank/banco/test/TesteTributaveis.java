package br.com.bytebank.banco.test;

//com as teclas ctrl+shift+o consigo fazer todas as importações
import br.com.bytebank.banco.modelo.CalculadorDeImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc= new ContaCorrente(432, 897);
		cc.deposita(1000);
		
		SeguroDeVida seg = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(seg);
		calc.registra(cc);
		
		System.out.println(calc.getTotalImposto());
	}

}

package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(23, 34);
		
		//a classe Object oferece uma implementação do toString() mas
		//não é muito útil
		//a ideia é que o desenvolvedor reemplemente pra dar um significado
		System.out.println(cc.toString());
		
		ContaPoupanca cp = new ContaPoupanca(45, 48);
		System.out.println(cp.toString());
		
		//como o método foi sobrescrito não preciso declarar
		System.out.println(cc);//o println busca o método que o aponta	
		System.out.println(cp);
		
		System.out.println(cc.hashCode());
	}

}

package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaArrayDeReferencia {

	public static void main(String[] args) {
		
		//Array de referência
		//cada índice PODE guardar uma referência para um objeto diferente
		//ainda não foi criado nenhum objeto além do array (que é um objeto)
		//por enquanto todos os valores são null
		ContaCorrente[] contas = new ContaCorrente[5];
		//acima foi criado um array com 5 campos com valor null
		ContaCorrente cc1 = new ContaCorrente(22, 89);
		//acima foi criado um objeto do tipo ContaCorrente
		contas[0] = cc1;//aqui foi salva uma cópia da referência para um dos índices do array
		
		
		ContaCorrente[] contasSerie = new ContaCorrente[10];
		for(int i=0;i<contasSerie.length;i++) {
			int numero = i + 1;
			contasSerie[i] = new ContaCorrente(27, numero);
		}
		
		System.out.println(contas[0]);
	
		System.out.println(cc1.getAgencia());
		ContaCorrente ref = contas[0];
		System.out.println(contas[0].getAgencia());
		System.out.println(contasSerie[8].getAgencia());
		System.out.println(ref.getAgencia());
		
		//aqui estou criando um array genérico que poderá receber CC ou CP 
		Conta[] generico = new Conta[5]; 
		
		ContaPoupanca cp = new ContaPoupanca(90, 15);
		
		generico[0] = cp;// recebendo conta poupança
		generico[1] = cc1;//recebendo conta corrente
		
		//ContaCorrente refer = generico[0];não compila pois a referência é do tipo Conta (mais genérico)
		//ref é do tipo ContaCorrente e não consegue guardar outro tipo de referência	
		Conta refer = generico[0];//desta forma complia pois o tipo de refer é igual
	
		ContaPoupanca moldar = (ContaPoupanca)generico[0];//type cast, modifica para mais específico
		
		//ContaCorrente moldar = (ContaCorrente)generico[0];este cast gera exceção pois está tentando mudar
		//para um tipo específico diferente
		//código compila mas não executa
	}

}

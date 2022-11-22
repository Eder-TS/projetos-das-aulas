package br.com.alura.io.java.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");//aqui aplicando charset na leitura do arquivo
																	//para correta interpretação
		
		while (scanner.hasNext()) {//para ler todas as linhas
			String linha = scanner.nextLine();
			//System.out.println(linha);
			
			Scanner scannerLinha = new Scanner(linha);//percorrer a linha
			scannerLinha.useLocale(Locale.US);//aqui para forçar a interpretar o ponto do saldo como separador decimal
			scannerLinha.useDelimiter(",");//verificar separador
			
			//aqui já consigo pegar cada valor separado
			String tipoConta = scannerLinha.next();
			int agencia = scannerLinha.nextInt();//lê o próximo elemento e faz parsing
			int conta = scannerLinha.nextInt();
			String titular = scannerLinha.next();
			double saldo = scannerLinha.nextDouble();
			
			//formatação de dados. Cada %s é referente a um valor, s de String, posso adicionar -, : ou ; junto a cada um
			String valorFormatado = String.format(new Locale ("pt", "BR"), "%s %04d-%06d %s: %10.2f", tipoConta, agencia, conta, titular, saldo);
			//ver documentação de .format
			System.out.println(valorFormatado);
			
			scannerLinha.close();
//			String[] valores = linha.split(",");//usando o método split da classe String
//			System.out.println(Arrays.toString(valores));//para obter um array
//			System.out.println(valores[3]);//mas não é a melhor maneira
			
			
			
		}
		
		scanner.close();

	}

}

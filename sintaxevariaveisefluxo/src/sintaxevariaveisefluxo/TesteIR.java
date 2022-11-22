package sintaxevariaveisefluxo;

public class TesteIR {
	public static void main(String[] args) {
		double salario = 3300.0;
		
		if (1900.0 <= salario && salario <= 2800.0) {
			System.out.println("Alíquota de 7,5%. Dedução de R$142,00.");
		} else if (2800.01 <= salario && salario <= 3751.0) {
			System.out.println("Alíquota de 15%. Dedução de R$350,00.");
		} else if (3751.01 <= salario && salario <= 4664.0) {
			System.out.println("Alíquota de 22,5%. Dedução de R$636,00.");
		}
	}
}

package sintaxevariaveisefluxo;

public class ExercicioLacos2 {
	public static void main(String[] args) {
		// mostrar todos os números multiplos de 3 entre 1 e 100
		for (int numero = 1; numero <= 100; numero++) {
			if (numero % 7 == 0) {
				System.out.println(numero);
			}
		}
	}
}

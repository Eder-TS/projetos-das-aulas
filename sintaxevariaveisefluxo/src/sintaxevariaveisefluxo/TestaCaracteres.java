package sintaxevariaveisefluxo;

public class TestaCaracteres {
	public static void main (String[] args) {
		char letra = 'a'; //char guarda apenas uma letra e precisa de aspas simples, segue tabela UNICODE
		System.out.println(letra);
		
		char numero = 66; //não é comum
		System.out.println(numero);
		
		char somaChar = (char) (numero + 1);//também não é comum
		System.out.println(somaChar);
		
		String palavras = "Alura cursos online de tecnologia";//String não é um tipo e não é palavra reservada Java
		System.out.println(palavras);
		
		palavras = palavras + 278742;//transforma o número em string e concatena
		System.out.println(palavras);
	}
}

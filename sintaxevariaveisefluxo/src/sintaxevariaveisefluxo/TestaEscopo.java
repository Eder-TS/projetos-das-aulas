package sintaxevariaveisefluxo;

public class TestaEscopo {
	public static void main(String[] args) {
		
		int quantidadePessoas = 2;
		//boolean acompanhado = quantidadePessoas >= 2; declaração e inicialização
		
		boolean acompanhado;//apenas declaração
		//System.out.println(acompanhado); não compila pois a variável não foi inicializada
		
		if (quantidadePessoas >= 2) {
			//boolean acompanhado = true; declarando dentro destas chaves só irá existir aqui dentro
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		//se omitir o else, há a possibilidade de a variável não ser inicializada
		System.out.println(acompanhado);//e o código não compilaria nesta linha
	}
}

package br.com.bytebank.banco.test;

public class TestaString {
	
	//esta String do main é uma classe dentro do Java 
	public static void main(String[] args) {
		//como qualquer classe posso instanciar um novo objeto
		String panga = "Eder TS";//esta sintaxe se chama object literal
		//a diferença é que não inicializa com o new pois a inicialização é implícita
		
		//vários métodos estão disponíveis 
		panga.replace("E", "O");
		System.out.println(panga);
		
		//porém o retorno sempre é em uma nova String
		//pois as Strings são imutáveis
		String xaxa = panga.replace("E", "O");
		System.out.println(xaxa);
		
		//outra versao de .replace
		char a = 'O';
		char b = 'I';
		String fuli = xaxa.replace(a, b);
		System.out.println(fuli);
		
		String eMail = "STEder20@yahoo.com.br";
		String emailLower = eMail.toLowerCase();
		System.out.println(emailLower);
		
		//método bastante usado
		char segunda = emailLower.charAt(1);//observar que se refere ao índice 
		System.out.println(segunda);
		
		//outro método bastante usado
		int arroba = emailLower.indexOf("@");
		System.out.println(arroba);
		
		String yahoo = emailLower.substring(arroba);
		System.out.println(yahoo);
		
		System.out.println(emailLower.length());
		
		String vazio = "";
		System.out.println(vazio.isEmpty());//por exemplo pode verificar se um cam foi preenchido
		
		String semEspaco = fuli.trim();//remove apenas os espaços do início e fim
		System.out.println(semEspaco);
		
		System.out.println(emailLower.contains(".com.br"));
	}

}

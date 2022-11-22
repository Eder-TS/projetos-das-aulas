package javapilha;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        try {
        	metodo2();
        } catch(ArithmeticException | NullPointerException | MinhaExcecao ex) {//tratamento de exceção
        	String msg = ex.getMessage();
        	System.out.println("Exceção: " + msg);
        	ex.printStackTrace();
        }    
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        
        throw new MinhaExcecao("deu muito errado");//new instancia um novo objeto
        //trow 'joga' a exceçao em cima da pilha
        //de tal forma que o código logo abaixo nem compila
       // System.out.println("Fim do metodo2");
        //throw não funciona para outros tipos de classes 
        
    }
}
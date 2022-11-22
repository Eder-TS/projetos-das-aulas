package javapilha;

public class FluxoTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        try {//o try é um bloco protegido onde a JVM pode desviar para o catch
        	metodo2();//correspondente, quando este for definido
        } catch(ArithmeticException ex) {//catch{"bloco de tratamento de alguma exceção}
        								//posso ter quantos catch's forem necessários
            							//também posso usar |(pipe) dentro de um catch apenas e aninhar todas as exceções possíveis
   
        	String msg = ex.getMessage();//o catch traz um tipo xxxException (uma classe) que posso usar
        								//vários métodos estao disponíveis nas classes de exceptions
        	System.out.println("ArithmeticException " + msg);
        }    
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            int a = i/0;
        }
        System.out.println("Fim do metodo2");
    }
}
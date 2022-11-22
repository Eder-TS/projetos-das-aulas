package javapilha;

public class FluxoNovoTeste {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
        } catch(Exception ex) {//tratamento de exceção.
        						//aqui usei apenas Exception pois esta classe é extendida
        						//para as classes filhas
        	String msg = ex.getMessage();
        	System.out.println("Exceção: " + msg);
        	ex.printStackTrace();
        }

        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecaoNovoTeste {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }
    
    //aqui preciso da declaração throws pois minha exceção está herdando diretamente da
    //classe Exception e não mais da classe RuntimeException que herda de Exception.
    //RuntimeException são para exceções não checadas (unchecked)
    //Exception são para exceções checadas na compilação(checked)
    //throws será declarado em todos os métodos até que a axceção seja tratada
    private static void metodo2() throws MinhaExcecaoNovoTeste {
        System.out.println("Ini do metodo2");
        
        throw new MinhaExcecaoNovoTeste("deu muito errado");//new instancia um novo objeto, neste caso do tipo MinhaExcecaoNovoTeste
        //trow 'joga' a exceçao em cima da pilha
        //de tal forma que o código logo abaixo nem compila
       // System.out.println("Fim do metodo2");
        //throw não funciona para outros tipos de classes 
        
    }
}
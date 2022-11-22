package bytebankherdado;

public class Designer extends Funcionario {
	
	public double getBonificacao() {//preciso implementar este método pois o método da classe mãe
		System.out.println("Chamando o método de bonificação do Designer.");//é abstrato.
		return 200.0;					//para não precisar implementar este método 
	}									//tenho que tornar essa classe fila abstrata também

}

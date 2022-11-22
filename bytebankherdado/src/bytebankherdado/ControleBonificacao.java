package bytebankherdado;

public class ControleBonificacao {
	private double soma;

	public double getSoma() {
		return this.soma;
	}
	
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma += boni;
	}
//	aqui o método funciona para todos os tipos de funcionários
//	pois a referência Funcionario é mais genérica, este é o
//	conceito de polimorfismo da herança
}

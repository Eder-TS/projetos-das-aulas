package bytebankherdado;

public abstract class Funcionario {

	private String nome;
	private String cpf;
//	protected double salario;//protected é publico para classes filhas
	private double salario;
	
	//método abstrato nao tem corpo, não implementa
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}

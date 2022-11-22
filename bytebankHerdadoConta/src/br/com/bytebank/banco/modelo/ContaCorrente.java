package br.com.bytebank.banco.modelo;

//a herança não herda o construtor
public class ContaCorrente extends Conta implements Tributavel {
	
//	public ContaCorrente() {//este construtor genérico não compila pois
//							//está tentando chamar o construtor genérico herdado que não existe 
//	}						//pois na classe mãe existe um cosntrutor específico
	
	public ContaCorrente (int agencia, int numero) {//isso compila pois
		super(agencia,numero);//está passando os mesmos parâmetros requeridos no
	}							//método da classe mãe

	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		valor += 0.2;//regra de negócio
		super.saca(valor);
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}//implementação do contrato com a interface
	
	
	//método sobrescrito da classe Object
	//a ideia é que o desenvolvedor reemplemente pra dar um significado
	@Override
	public String toString() {
		return "Conta Corrente " + super.toString();
	}
}

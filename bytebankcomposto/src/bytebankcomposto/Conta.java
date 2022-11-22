package bytebankcomposto;

class Conta {
	private double saldo;//private impede leitura e escrita de fora da classe
	int agencia = 42;// posso atribuir algum valor aqui
	int numero;// porém o Java instancia novos objetos com atributos zerados
	Cliente titular;

	public void deposita(double valor) {
		this.saldo += valor;// this é opcional neste caso, usando ele o método invocado
							// pela conta do TestaMetodo fará saldo se referenciar ao saldo desta conta
	} // é boa prática usar o this

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}//é comum não usar o else nestes casos onde só tem return
		return false;
	}

	public boolean transfere(Conta origem, double valor, Conta destino) {
		if (origem.saca(valor)) {
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {//por convenção é usado o get no nome do método que "pega" algum valor
		return this.saldo;
	}
}

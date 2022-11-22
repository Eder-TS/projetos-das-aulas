package bytebank;

class Conta {
	double saldo;// posso atribuir algum valor aqui
	int agencia = 42;// porém o Java instancia novos objetos com atributos zerados
	int numero;
	String titular;

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
}

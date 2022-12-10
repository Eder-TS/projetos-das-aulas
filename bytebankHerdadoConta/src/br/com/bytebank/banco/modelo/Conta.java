package br.com.bytebank.banco.modelo;

import java.io.Serializable;

//package será sempre a primeira declaração

//br.com.bytebank.banco é um padrão da comunidade (endereço web ao contrário)

/**
 * Esta classe representa a moldura da conta
 * 
 * @author Eder TS
 *
 *         Este tipo de comentário serve para qualquer membro público do código
 *         pois, se alguém for usar esta classe em outro projeto terá uma
 *         explicação de como usar.
 */

//com abstract esta classe não pode mais instanciar nenhum objeto
//Interface Comprable para definir ordem natural na ordenação de lista de contas
public abstract class Conta implements Comparable<Conta>, Serializable {
	protected double saldo;
	private int agencia;
	private int numero;
	private /*transient*/ Cliente titular;//palavra transient torna a classe Cliente não serializável
									//a partir da Conta, porém os dados do cliente não serão gravados
									//os métodos da classe Cliente não irão funcionar na desserialiação
									//nem mesmo a referência do objeto Cliente será gravadda
	private static int total;

//	public Conta() {//construtor genérico
//					//que pode ser chamado por uma classe filha
//	}

	/**
	 * Construtor para inicializar um novo objeto Conta
	 * 
	 * @param agencia
	 * @param numero
	 */

	public Conta(int agencia, int numero) {// construtor específico

		if (setAgencia(agencia) && setNumero(numero)) {
			Conta.total++;
			// System.out.println("O total de contas é: " + Conta.total);
			// System.out.println("Conta número " + numero + ", agência " + agencia + ", foi
			// criada.");
		} else {
			return;
		}

	}

	public void deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		} else {
			System.out.println("Valor inválido: " + valor);
			return;
		}
	}

	/**
	 * Valor precisa ser maior que saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException {// foi alterada lógica do método para tratamento
																		// da exceção

		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + " Valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);// método saca precisa passar pela exceção
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public boolean setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Número inválido: " + numero);
			return false;
		} else { // é convenção usar o nome da variável temporária igual ao
			this.numero = numero;// atributo pois usa-se o this
			return true;
		}
	}

	public int getAgencia() {
		return this.agencia;
	}

	public boolean setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Agência inválido: " + agencia);
			return false;
		} else {
			this.agencia = agencia;
			return true;
		}
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {// aqui novamente declara static para acessar sem especificar o objeto
		return Conta.total;
	}

	@Override
	public String toString() {
		return "número " + this.numero;
	}

	@Override
	public boolean equals(Object ref) {
		Conta outra = (Conta)ref;
		if (this.agencia != outra.agencia || this.numero != outra.numero) {
			return false;
		}
		return true;
	}
	
	
	//definindo ordem natural com saldo
	@Override
	public int compareTo(Conta outra) {
		
		return Double.compare(this.saldo, outra.saldo);
	}
}

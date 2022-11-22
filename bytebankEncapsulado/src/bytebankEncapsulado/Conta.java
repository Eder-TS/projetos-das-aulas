package bytebankEncapsulado;

class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;// aqui foi criado um atributo para contagem do total de contas
	// este atributo se refere à classe e não aos objetos instanciados
	// isso é possível graças ao tipo static que é como uma variável global desta
	// classe

	// este é o construtor da classe chamado apenas em new "classe()"
	// se não for declarado o Java cria um construtor "vazio"
	// podemos ter mais de um construtor
	public Conta(int agencia, int numero) {// aqui podem ser feitas atribuições de acordo co a regre de negócio

		if (setAgencia(agencia) && setNumero(numero)) {
			Conta.total++;// Conta aqui funciona como o this, porém se referenciando a classe Conta
			System.out.println("O total de contas é: " + Conta.total);// implementação da variável static
			System.out.println("Conta número " + numero + ", agência " + agencia + ", foi criada.");
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

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transfere(Conta origem, double valor, Conta destino) {
		if (origem.saca(valor)) {
			destino.deposita(valor);
			return true;
		}
		return false;
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
}

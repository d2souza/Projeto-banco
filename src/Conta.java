
public class Conta {
	private double saldo;
	private int numero;
	private int agencia;
	private Cliente titular;
	private static int total = 0;

	public Conta(int agencia, int numero) {
		String numeroConta = Integer.toString(numero);
		String agenciaConta =  Integer.toString(agencia);
		if (numeroConta.length() != 5) {
			System.out.println("Numero inválido");
			return;
		}
		if (agenciaConta.length() != 3) {
			System.out.println("Agencia inválida");
			return;
		}
		Conta.total++;
		System.out.println("o total de contas é: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0;
	}

	public static int getTotal() {
		return total;
	}

	public int getNumero() {
		System.out.print("Conta numero: ");
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Você sacou: " + valor);
			return true;
		} else {
			System.out.println("Você não tem saldo suficiente para realizar esta transação.");
			return false;
		}

	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}

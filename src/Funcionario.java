
public class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	protected int numeroDeFaltas;
	
	public double getBonificacao() {
		if (numeroDeFaltas >= 1) {
			System.out.println("Ta ferrado meu parceiro");
			return salario * 0;
		}
		return salario * 0.1;
	}
	
	public int getNumeroDeFaltas() {
		return numeroDeFaltas;
	}
	public void setNumeroDeFaltas(int numeroDeFaltas) {
		this.numeroDeFaltas = numeroDeFaltas;
	}
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

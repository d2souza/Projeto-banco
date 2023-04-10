package br.com.girorio.banco.modelo;

public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	protected int numeroDeFaltas;
	
	public abstract double getBonificacao();
	
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

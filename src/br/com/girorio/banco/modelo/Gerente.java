package br.com.girorio.banco.modelo;

public class Gerente extends Funcionario implements Autenticavel{
	private int senha;

	@Override
	public double getBonificacao() {
		if (super.numeroDeFaltas >= 1) {
			System.out.println("Ta ferrado meu parceiro");
			return super.getSalario() * 0;
		} else {
			System.out.println(this.getBonificacao());
			return this.getBonificacao() * 0.5 + super.getSalario();
		}
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}

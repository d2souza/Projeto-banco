package br.com.girorio.banco.modelo;

public class Administrador extends Funcionario implements Autenticavel {

	private int senha;

	@Override
	public double getBonificacao() {
		if (numeroDeFaltas >= 1) {
			System.out.println("Ta ferrado meu parceiro");
			return super.getSalario() * 0;
		} else {
			return getSalario() * 0.1;
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

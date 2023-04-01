
public class Gerente extends Funcionario {
	private int senha;

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Bem vindo.");
			return true;
		} else {
			System.out.println("Usuário ou senha invalidos");
			return false;
		}
	}

	public double getBonificacao() {
		if (super.numeroDeFaltas >= 1) {
			System.out.println("Ta ferrado meu parceiro");
			return super.getSalario() * 0;
		} else {
			System.out.println(super.getBonificacao());
			return super.getBonificacao() * 0.5 + super.getSalario();
		}
	}
}

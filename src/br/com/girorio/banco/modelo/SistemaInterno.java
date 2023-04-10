package br.com.girorio.banco.modelo;

public class SistemaInterno {

	private int senha = 2222;
	
	public void autentica (Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if (autenticou) {
			System.out.println("Bem vindo!");
		}else {
			System.out.println("Usuario ou senha inv�lidos.");
		}
	}

}

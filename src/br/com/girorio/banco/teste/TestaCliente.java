package br.com.girorio.banco.teste;
import br.com.girorio.banco.modelo.Conta;
import br.com.girorio.banco.modelo.ContaCorrente;

public class TestaCliente {

	public static void main(String[] args) {
		
		Conta conta1 = new ContaCorrente(369, 147258);
		System.out.println(Conta.getTotal() + conta1.getNumero());

	}

}

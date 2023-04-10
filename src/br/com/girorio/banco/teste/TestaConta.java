package br.com.girorio.banco.teste;
import br.com.girorio.banco.modelo.Conta;
import br.com.girorio.banco.modelo.ContaCorrente;
import br.com.girorio.banco.modelo.SaldoInsuficienteException;

public class TestaConta {

	public static void main(String[] args) {

		Conta conta = new ContaCorrente(123, 12345);
//		conta.deposita(200);

		try {
			conta.saca(210);
		} catch (SaldoInsuficienteException ex) {
			String msg = ex.getMessage();
			System.out.println(msg);
		}

	}

}

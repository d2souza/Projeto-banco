package br.com.girorio.banco.modelo;

public class SaldoInsuficienteException extends RuntimeException {

	public SaldoInsuficienteException(String msg) {
		
		super(msg);
	}
}

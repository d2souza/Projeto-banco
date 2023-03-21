
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoDaniel = new Conta();
		contaDoDaniel.deposita(200);
		System.out.println(contaDoDaniel.saldo);
		
		contaDoDaniel.saca(250);
		System.out.println(contaDoDaniel.saldo);
		
	}

}

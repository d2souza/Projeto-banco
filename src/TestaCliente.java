
public class TestaCliente {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta(369, 147258);
		System.out.println(Conta.getTotal() + conta1.getNumero());

	}

}

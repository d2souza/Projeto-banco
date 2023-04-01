
public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario daniel = new Funcionario();
		
		daniel.setCpf("255.255.255-25");
		daniel.setNome("Daniel Souza");
		daniel.setNumeroDeFaltas(0);
		daniel.setSalario(3600);
		
		//System.out.println("Funcionário: " + daniel.getNome() + "\nBônus do mês: R$ " + daniel.getBonificacao());

		
//		Gerente euMesmo = new Gerente();
//		euMesmo.setSenha(2222);
//		euMesmo.setSalario(5000);
//		euMesmo.setNumeroDeFaltas(0);
//		System.out.println("Gerente \n" + euMesmo.autentica(2222)
//		+ "\nSalário: " + (euMesmo.getBonificacao() + euMesmo.getSalario()));
		
	}

}


public class TestaContaSemCliente {

	public static void main(String[] args) {
		
		Conta contaMarjori = new Conta();
		//System.out.println(contaMarjori.saldo);
		
		contaMarjori.titular.nome = "Marjori";
		System.out.println(contaMarjori.titular.nome);

		contaMarjori.titular = new Cliente();
		
		contaMarjori.titular.nome = "Marjori";
		System.out.println(contaMarjori.titular.nome);
		
	}

}

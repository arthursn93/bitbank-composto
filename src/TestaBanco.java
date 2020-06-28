
public class TestaBanco {

	public static void main(String[] args) {
		//instanciamos a classe Cliente com os seus atributos
		Cliente arthur = new Cliente();
		arthur.nome = "Arthur da Silva Nunes";
		arthur.cpf = "378.316.478-80";
		arthur.profissao = "Programador Jr.";
		
		//instanciamos a classe Conta com um deposito como atributo
		Conta contaArthur = new Conta();
		contaArthur.deposita(100);
		
		//referenciamos o nome do titular na contaArthur
		contaArthur.titular = arthur;
		System.out.println(contaArthur.titular.nome);
		
		// ambas pertencem ao mesmo objeto, pois estão sendo referenciadas pelo mesmo objeto
		System.out.println(contaArthur.titular);
		System.out.println(arthur);
		
	}

}

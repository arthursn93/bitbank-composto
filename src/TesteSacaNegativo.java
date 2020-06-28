
public class TesteSacaNegativo {

	public static void main(String[] args) {
		
		Conta conta01 = new Conta();
		Conta conta02 = new Conta();
		
		conta01.deposita(100);
		conta01.saca(300, conta02);
		
		System.out.println(conta01.pegaSaldo());

		

	}

}

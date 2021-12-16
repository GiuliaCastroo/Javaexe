package pooex;

public class Testeavião {

	public static void main(String[] args) {
		Avião Av1 = new Avião ();
		
		Av1.setCor("Branco");
		Av1.setNome("Ocean 306");
		Av1.ligado();
		Av1.setTamanho(730);
		
	
		System.out.println(Av1.getCor());
		System.out.println(Av1.getNome());
		System.out.println(Av1.getTamanho());
		Av1.escrever();
	
		System.out.printf("\nO Avião vai decolar :) ");
		
	}
	
		
}

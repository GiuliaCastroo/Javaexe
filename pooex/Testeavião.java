package pooex;

public class Testeavi�o {

	public static void main(String[] args) {
		Avi�o Av1 = new Avi�o ();
		
		Av1.setCor("Branco");
		Av1.setNome("Ocean 306");
		Av1.ligado();
		Av1.setTamanho(730);
		
	
		System.out.println(Av1.getCor());
		System.out.println(Av1.getNome());
		System.out.println(Av1.getTamanho());
		Av1.escrever();
	
		System.out.printf("\nO Avi�o vai decolar :) ");
		
	}
	
		
}

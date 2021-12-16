package pooex;

public class TestePatinete {

	public static void main(String[] args) {
		
		Patinete P1 = new Patinete() ;
				
		P1.setCor("Rosa");
		P1.setFaixaeta("Infantil");
		P1.setBrilha(true);
		P1.setRodinhasBrilha(true);
		
		
		System.out.println(P1.getCor());
		System.out.println(P1.getFaixaeta());
		P1.brilha();
		
		
	}

}

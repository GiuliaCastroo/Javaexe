package Condicional;

import java.util.Scanner;

public class exer3case {
				
	public static void main(String[] args) {
		  Scanner entrada = new Scanner(System.in);
		  System.out.println("Escolha a categoria que se enquadra: \n(1) 10-14 Anos  \n(2)  15 -17 Anos \n(3)18-25 Anos");
		  int num = entrada.nextInt();
		  switch (num) {
		     case 1:
		       System.out.println("Categoria Infantil");
		       break;
		     case 2:
		       System.out.println("\nCategoria Juvenil");
		       break;
		     case 3:
		       System.out.println("\nCategoria Adulta");
		       break;
		     
		     default:
		       System.out.println("Número inválido");
		  }
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
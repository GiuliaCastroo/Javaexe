package Repetição;

import java.util.Scanner;

public class exerc3 {

	public static void main(String[] args) {
		int n1 , n2 = 0 , n3 = 0;
		Scanner ler  = new Scanner(System.in);
		
		System.out .print("\nDigite sua idade:  ");
		n1 = ler.nextInt();
		while (n1 != -99 )
		{
			if (n1 <21) 
			n3++;
			if (n1 >50) 
			n2++;
			System.out .print("\nInsira -99 para finalizar o programa.");
			n1 = ler.nextInt();
			
		}
			
			
			System.out .printf("\nO total de pessoas com menos de 21 anos é: "  + n3 );
			System.out .printf("\nO total de pessoas com 50+ anos é: "  + n2);
			System.out .print("\n");
			
		
		
		
		
		
		
		
		
		

	}

	private static void system(String string) {
		// TODO Auto-generated method stub
		
	}

}

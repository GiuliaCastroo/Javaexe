package Repetição;

import java.util.Scanner;

public class exer6 {

	public static void main(String[] args) {
		int num , média = 0, m=0;
		Scanner ler  = new Scanner(System.in);
		
		
		System.out .print("\nDigite os números:  ");
		num = ler.nextInt();
		do 
		{
			if (num %3 == 0);
			
			{
				m = num + num  /num;
				System.out.print("\nA média dos multiplos de 3 são:  " + m );
				num = ler.nextInt();
			} 
			
			if (num / 3 >=0 )
			{
		          System.out.print("O numéro não é multiplo de 3, digite 0 para sair do programa!!");
		          ler.nextInt();
		          
			}
		
			
		
		} while (num != 0);
	
					
	
	}

}

package Repeti��o;

import java.util.Scanner;

public class exer6 {

	public static void main(String[] args) {
		int num , m�dia = 0, m=0;
		Scanner ler  = new Scanner(System.in);
		
		
		System.out .print("\nDigite os n�meros:  ");
		num = ler.nextInt();
		do 
		{
			if (num %3 == 0);
			
			{
				m = num + num  /num;
				System.out.print("\nA m�dia dos multiplos de 3 s�o:  " + m );
				num = ler.nextInt();
			} 
			
			if (num / 3 >=0 )
			{
		          System.out.print("O num�ro n�o � multiplo de 3, digite 0 para sair do programa!!");
		          ler.nextInt();
		          
			}
		
			
		
		} while (num != 0);
	
					
	
	}

}

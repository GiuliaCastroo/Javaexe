package Matrizvetor;

import java.util.Scanner;

public class exe3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int [] [] n1 ;
		n1 = new int [4] [6];
		int  [] [] n2;
		n2 = new int [4] [6];
		int [] [] m1; 
		m1 = new int [4] [6];
		int [] [] m2 ; 
		m2 = new int [4] [6];
		int l=0 , c=0  ;
		
		for (l = 0 ; l < 4 ; l ++) {
			for (c = 0 ; c < 6 ; c ++)
			System.out.printf("\nValor da posição de N1 [" + l+1 + "]" + "[" + c+2 + "] : " );
			(n1 [l]  [c])= ler.nextInt();
			
		}
		
		for (l = 0 ; l < 4 ; l ++) {
			for (c = 0 ; c < 6 ; c ++)
			System.out.printf("\nValor da posição de N2 [" + l+1 + "]" + "[" + c+2 + "] : " );
			(n2 [l]  [c])= ler.nextInt();
		}
	
				System.out.println("N1 + N2 = M1 :\n");
	
		   for (l = 0 ; l < 4 ; l ++) {
				for (c = 0 ; c < 6 ; c ++)
						m1 [l] [c] = n1 [l] [c] + n2 [l] [c];
					System.out.printf("[" + m1 [l] [c] + "]");
					System.out.printf("\n");
				}
	
				System.out.println("\nN1 - N2 = M2 :\n");
	
				for (l = 0 ; l < 4 ; l ++) {
					for (c = 0 ; c < 6 ;  c ++)
					m2 [l] [c] = n1 [l] [c] - n2 [l] [c];
					System.out.printf("[" + m2 [l] [c] + "]");
					System.out.printf("\n");
				}
				
	
	
	}

}

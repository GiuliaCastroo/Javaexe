package Matrizvetor;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int dado = 10;
		int v [] = new int [dado];
		int i;
	
		for (i=0 ; i< dado; i++) {
			System.out.printf("Informe o numéro do dado " );
			v [i] = ler.nextInt();
		}
	
		int media= 0;
		int menor = v [0];
		int maior = v [0];
			for ( i =0 ; i<dado; i++) {
			media = i + dado / dado;
			
			if (v[i] < menor)
			menor = v[i];
		
			if (v[i] > maior)
				maior = v[i];
				
			}
	
			System.out.printf("\n");
			for (i=0 ; i< dado ; i++) {
			if (v[i] == maior)	
				System.out.printf("\n A maior pontuação foi " + v[i] );			
						System.out.printf("\n è a média foi:  " + media);
			}
			
			  System.out.printf("\nFim do Programa" );
	
	
	
	
	
	
	
	}
}

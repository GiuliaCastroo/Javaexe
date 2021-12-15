package Matrizvetor;

import java.util.Scanner;


public class exvetor1 {
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
		
	int n = 5;
	int v [] = new int [n];
	int i;
	
	for (i=0 ; i<n ; i++) {
		System.out.printf("Informe suas notas  ", (i+1) , n );
		v [i] = ler.nextInt();
	}
	
	{
		int soma = 0;
		int menor = v [0];
		int maior = v [0];
		for ( i =0 ; i<n; i++) {
			
			if (v[i] < menor)
			menor = v[i];
		
			if (v[i] > maior)
				maior = v[i];
		}
		
		System.out.printf("\n");
		for (i=0 ; i<n ; i++) {
		if (v[i] == maior)	
			System.out.printf("\n A sua maior nota foi: " + v[i] );			
		}
		
		  System.out.printf("\n Fim do porgrama!!");
		
		
	
	}
	
	}
}
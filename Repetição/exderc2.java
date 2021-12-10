package Repetição;

import java.util.Scanner;

public class exderc2 {

	public static void main(String[] args) {
		int par=0 , num , i, impar=0;
		Scanner ler = new Scanner (System.in);
		System.out.print("\nInsira 10 numeros:  ");
		num = ler.nextInt();
		for (i =1; i <=10; i++)
		
		
			if (num % 2 == 0 ) 
		    par = par ++;
		    par = ler.nextInt();
		
		
		impar = (10 - par);
		impar = ler.nextInt();
		
		System.out.print("\nPares:  " + par);
		System.out.print("\nImpares:  " + impar ) ;
		System.out.print("\n");
		
	}

}

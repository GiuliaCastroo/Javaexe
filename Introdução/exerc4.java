package Introdução;

import java.util.Scanner;

public class exerc4 {

	public static void main(String[] args) {
		float A, B, C , R , D ,S;
		System.out.print("Insira o valor A:  ");
		Scanner ler = new Scanner(System.in);
		A = ler.nextFloat();
		
		System.out.print("Insira o valor B:  ");
		B = ler.nextFloat();
		
		
		System.out.print("Insira o valor C:  ");
		C = ler.nextFloat();
		
		R = (A + B) * 2;
		S=  (B + C) * 2;
		D=  (R + S) / 2;
		
		System.out.printf("\nO Valor é : ");
		System.out.print(D);
		
		
	}

}

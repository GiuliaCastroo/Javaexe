package Introdução;

import java.util.Scanner;

public class Exerc3 {
			
				public static void main(String[] args) { 
				float segundos , horas , minutos;
				Scanner ler = new Scanner (System.in);
				System.out.println("Quantos segundos durou o evento? ");
			    segundos = ler.nextFloat();
			    minutos = segundos / 60;
			    horas = minutos / 60;
			    System.out.printf("O Eventou durou: ");
			    System.out.print(horas);
			    System.out.printf("\nHoras e  ");
			    System.out.print(minutos);
			    System.out.printf("\nMinutos e  ");
			    System.out.print(segundos);
			    System.out.printf("\nSegundos");


				}
}

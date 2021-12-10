package Condicional;

import java.util.Scanner;

public class exerc2 {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);  
		int num1, num2 , num3 ;
		 	System.out.print("Informe o primeiro valor: ");
		    num1 = ler.nextInt();
		    System.out.print("Informe o segundo valor: ");
		    num2 = ler.nextInt();
		    System.out.print("Informe o terceiro valor: ");
		    num3 = ler.nextInt();
		
		    	if(num1 > num2){
		        int temp = num1;
		        num1 = num2;
		        num2 = temp;
		      }
		
		    	if(num2 > num3){
		        int temp = num2;
		        num2 = num3;
		        num3 = temp;
		      }
		
		    	if(num1 > num2){
		        int temp = num1;
		        num1 = num2;
		        num2 = temp;
		      }
		
		    	 System.out.println("Os números em ordem crescente são: ");
		    	 System.out.println(num1 + "  " + num2 + "  " + num3);
		    	     
		    	 System.out.println("\n");
		
		
		
	}

}

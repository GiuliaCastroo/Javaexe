package Condicional;

import java.util.Scanner;

public class exerc1 {

	public static void main(String[] args) {
		        Scanner ler = new Scanner(System.in);  
			    int a, b, c, menor , maior ;
			 	System.out.print("Informe o primeiro valor: ");
			    a = ler.nextInt();
			    System.out.print("Informe o segundo valor: ");
			    b = ler.nextInt();
			    System.out.print("Informe o terceiro valor: ");
			    c = ler.nextInt();
			    
			    menor = a;
			    maior = a ;
			    
			    if (menor > b)
			    menor =b;
			    
			    if (menor > c)
				    menor =c;
				
			    
			   if (maior <b)
				   maior = b;
			   if (maior <c)
				   maior = c;
			    
			   
			   
			   
			     System.out.println(maior);
		    	 
			    
			    
			    
			    
	
	}

}

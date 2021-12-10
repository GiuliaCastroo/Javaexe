package Introdução;

import java.util.Scanner;

public class exerc8 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
				int cf= 28  , cc = 0, imposto = 49;
				Scanner ler = new Scanner(System.in);
				System.out.printf("Informe o custo de Fabrica: ");
				cc = ler.nextInt();				
				
				System.out.printf("Informe o custo consumidor sem impostos: ");
				ler.nextInt(cf);	
				cf = cc;
				cf = cc + (cf * imposto) /100;
				imposto = cf + (cf * imposto) / 100;
				cc = cf + imposto;
				System.out.printf("O Custo total do consumidor é ");
				System.out.print(cc);
	}

}

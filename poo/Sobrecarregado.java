package poo;

///Sobrecarga de Métodos///

public class Sobrecarregado {
			public void testametodo()
			{
				System.out.printf("Salário tem numéro inteiro: %d\n" , salario(1000));
				System.out.printf("Salário tem numéro double: %f\n" , salario(7.500));
				
				
			}
			
			public int salario(int valorint)
			{
				
				System.out.printf("Salário  inteiro: %d\n" , valorint);
				return valorint * valorint;
			}

			public double salario (double valordouble)
			{
				System.out.printf("Salário  fracionado: %f\n" , valordouble);
				return valordouble * valordouble;
				
			}

}

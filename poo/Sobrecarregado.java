package poo;

///Sobrecarga de M�todos///

public class Sobrecarregado {
			public void testametodo()
			{
				System.out.printf("Sal�rio tem num�ro inteiro: %d\n" , salario(1000));
				System.out.printf("Sal�rio tem num�ro double: %f\n" , salario(7.500));
				
				
			}
			
			public int salario(int valorint)
			{
				
				System.out.printf("Sal�rio  inteiro: %d\n" , valorint);
				return valorint * valorint;
			}

			public double salario (double valordouble)
			{
				System.out.printf("Sal�rio  fracionado: %f\n" , valordouble);
				return valordouble * valordouble;
				
			}

}

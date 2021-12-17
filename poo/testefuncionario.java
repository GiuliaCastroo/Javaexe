package poo;

public class testefuncionario {

	public static void main(String[] args)
	{
		funcionario func = new funcionario() ;
		func.setNome("Mario");
		func.setSalrio(1600);
		
		
		System.out.println(func.getNome());
		System.out.println(func.getSalrio());
	}

}

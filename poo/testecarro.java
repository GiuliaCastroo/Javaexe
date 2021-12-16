package poo;

public class testecarro {

	public static void main(String[] args) {
		excarro meuCarro = new excarro();
		meuCarro.cor = "Vermelho";
		meuCarro.modelo = "Passat";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeAtual = 80;
	
	
		meuCarro.liga();
		
		meuCarro.acelera(20);
		System.out.println(meuCarro.velocidadeAtual);
		
		meuCarro.pegaMarcha();
	
	}

}

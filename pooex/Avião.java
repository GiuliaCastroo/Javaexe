package pooex;

public class Avi�o {
				//Atributos	
				private String Nome;
				private	int tamanho;
				private String cor;
				private boolean ligado;


				
				//M�todos
				public void ligado() {
					ligado = true;
				}
				

				public void desligado() {
					ligado = false;
				}	
				
				public void escrever () {
				if (ligado==true)
					System.out.print("O Avi�o est� ligado");
				else 
					System.out.print("O Avi�o est� desligado");
				}


				
				//Get e Set
				public String getNome() {
					return Nome;
				}


				public void setNome(String nome) {
					Nome = nome;
				}


				public int getTamanho() {
					return tamanho;
				}


				public void setTamanho(int tamanho) {
					this.tamanho = tamanho;
				}


				public String getCor() {
					return cor;
				}


				public void setCor(String cor) {
					this.cor = cor;
				}


				public boolean isLigado() {
					return ligado;
				}


				public void setLigado(boolean ligado) {
					this.ligado = ligado;
				}
				
			
				
					


}

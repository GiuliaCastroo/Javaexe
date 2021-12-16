package pooex;

public class Patinete {

			private String cor;
			private boolean brilha; 
			private boolean rodinhasBrilha;
			private String Faixaeta;

			public void EleBrilha() {
				brilha = true;
			}

			public void NBrilha() {
				brilha = false;
			}
			
			public void escrever () {
				if (brilha==true)
					System.out.print("O Patinete Brilha ");
				else 
					System.out.print("O Patinete Não Brilha ");
				}

			public void escrever1 () {
				if (rodinhasBrilha==true)
					System.out.print("As rodinhas do patinete brilham ");
				else
					System.out.print("As rodinhas do patinete não brilham");
			}
				
				
			public void brilha () {
			if (brilha == true && rodinhasBrilha==true )
				System.out.print("O Patinete inteiro Brilha :)");
			else
				System.out.print("O Patinete não brilha inteiro :(");
			}

			// Get e set
			public String getCor() {
				return cor;
			}

			public void setCor(String cor) {
				this.cor = cor;
			}

			public boolean isBrilha() {
				return brilha;
			}

			public void setBrilha(boolean brilha) {
				this.brilha = brilha;
			}

			public boolean isRodinhasBrilha() {
				return rodinhasBrilha;
			}

			public void setRodinhasBrilha(boolean rodinhasBrilha) {
				this.rodinhasBrilha = rodinhasBrilha;
			}

			public String getFaixaeta() {
				return Faixaeta;
			}

			public void setFaixaeta(String faixaeta) {
				Faixaeta = faixaeta;
			}
			
			
			
			
			
			
			


}

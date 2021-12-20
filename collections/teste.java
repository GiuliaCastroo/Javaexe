package collections;

import java.util.*;


public class teste {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		ArrayList<Estoque> estoque = new ArrayList<>();
		
		
		System.out.println(" ||Seja bem-vinde ao estoque da loja de Pelúcias, Ursinho & Cia||\r\n "
						+"Siga as instruções que lhe foram dadas para inserir ou retirar alguma mercadoria do estoque :D\r\n "
						+"Qualquer dúvida entre em contato com seu superior ou gerente!!"
				);
		
		
		int press = -1;
		
		estoque.add(new Estoque("Urso Pardo (PEQUENO)", 2003));
		estoque.add(new Estoque("Urso Polar (GRANDE)", 2004));
		estoque.add(new Estoque("Urso Panda (GRANDE)", 2005));
		estoque.add(new Estoque("Urso Panda(PEQUENO)", 2007));
		estoque.add(new Estoque("Urso Polar(MEDIO)", 2008));
		estoque.add(new Estoque("Ursinho Rosa(PEQUENO)", 2009));
		estoque.add(new Estoque("Urso-De-Óculos(GRANDE)", 2010));
		
		
		
		while(press !=0) {
			
		System.out.println("\nVOCÊ GOSTARIA DE??\n\n[1]ADICONAR UM PRODUTO \n[2]REMOVER UM PRODUTO \n[3]ATUALIZAR UM PRODUTO \n[4]MOSTRAR O ESTOQUE \n[0]SAIR DO ESTOQUE" );
		press = scanner.nextInt();
		
			if (press == 1) {
				System.out.println("Insira o nome do produto que deseja adicionar. Lembre-se de escrever igual o do Menu\nSe tiver esquecido volte e digite 4 para ver o Menu de nomes ");			
				String produto = scanner.next();
			
				System.out.println("Insira o nº de série do produto");
				int n = scanner.nextInt();
				System.out.println("O PRODUTO ADICIONADO COM SUCESSO!!!");
				estoque.add(new Estoque(produto, n));
				} 
		
			else if (press == 2) {
				System.out.println("Digite o número do item que deseja remover: ");
				int n = scanner.nextInt();
				System.out.println("PRODUTO REMOVIDO!!!");
				estoque.remove(n);
				} 
		
			else if (press == 3) {
				System.out.println("Digite o número do item que deseja atualizar: ");
				int n = scanner.nextInt();
			
				System.out.println("Insira o nome do novo produto: ");
				String produto = scanner.next();
			
				System.out.println("Insira o nº de série do produto: ");
				int n1 = scanner.nextInt();
				System.out.println("O PRODUTO FOI ATUALIZADO COM SUCESSO!!!");
			
				estoque.set(n1, new Estoque(produto, n1));			
			} 
			
			else if (press == 4) {	
				System.out.println("PRODUTOS ESTOQUE: ");
				System.out.println();	
				}

		
			else {
			System.out.println("FECHANDO O PROGRAMA!!! \n\nPRODUTOS ESTOQUE:");
			}
		
			for (int i = 0; i < estoque.size(); i++ ) {
			System.out.println(i + "|" + estoque.get(i));	
			System.out.println();
			}
		}
		scanner.close();
	}
}

package Ex001;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
	public static void main(String[] args) {
		String produto1 = "Arroz";
		String produto2 = "Feij�o";
		String produto3 = "Macarr�o";
		String produto4 = "Batata";
		boolean rodar = true;

		ArrayList<String> estoque = new ArrayList<>();

		// INSERINDO DADOS A LISTA
		estoque.add(produto1);
		estoque.add(produto1);
		estoque.add(produto1);
		estoque.add(produto2);
		estoque.add(produto3);
		estoque.add(produto3);
		estoque.add(produto4);
		estoque.add(produto4);

		//APRESENTANDO TODOS OS DADOS NA LISTA
		System.out.println("Produtos dispon�veis: " + estoque);

		System.out.println("Voc� deseja comprar algum produto? \n(1) SIM \n(2) N�O");
		Scanner leia = new Scanner(System.in);
		int comprar = leia.nextInt();

		while (rodar == true) {
			if (comprar == 1) {
				System.out.println("Qual produto voc� deseja comprar? ");
				String comprarProduto = leia.next();
				estoque.contains(comprarProduto);

				if (estoque.contains(comprarProduto) == false) {
					System.out.println("PRODUTO INDISPON�VEL.");
				}

				else {
					int posicao = estoque.indexOf(comprarProduto);
					// REMOVENDO DADOS DA LISTA
					estoque.remove(posicao);
				}
				
				System.out.println("Deseja comprar novamente \n(1) SIM \n(2) N�O?");
				int desejaComprar = leia.nextInt();
				switch (desejaComprar) {
				case 2:
					rodar = false;
					break;
				}
			}
			
			else {
				System.out.println("====PROGRAMA FINALIZADO====");
				rodar = false;
				System.exit(0);
			}
		}
		// ATUALIZANDO LISTA
		System.out.println("Produtos dispon�veis no estoque ap�s a compra: " + estoque);
		leia.close();
	}
}

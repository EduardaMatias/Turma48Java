package Ex001;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
	public static void main(String[] args) {
		String produto1 = "Arroz";
		String produto2 = "Feijão";
		String produto3 = "Macarrão";
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
		System.out.println("Produtos disponíveis: " + estoque);

		System.out.println("Você deseja comprar algum produto? \n(1) SIM \n(2) NÃO");
		Scanner leia = new Scanner(System.in);
		int comprar = leia.nextInt();

		while (rodar == true) {
			if (comprar == 1) {
				System.out.println("Qual produto você deseja comprar? ");
				String comprarProduto = leia.next();
				estoque.contains(comprarProduto);

				if (estoque.contains(comprarProduto) == false) {
					System.out.println("PRODUTO INDISPONÍVEL.");
				}

				else {
					int posicao = estoque.indexOf(comprarProduto);
					// REMOVENDO DADOS DA LISTA
					estoque.remove(posicao);
				}
				
				System.out.println("Deseja comprar novamente \n(1) SIM \n(2) NÃO?");
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
		System.out.println("Produtos disponíveis no estoque após a compra: " + estoque);
		leia.close();
	}
}

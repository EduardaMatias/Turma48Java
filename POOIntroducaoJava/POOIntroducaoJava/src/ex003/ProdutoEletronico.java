package ex003;
import java.util.Scanner;
public class ProdutoEletronico {
	String nomeProduto;
	int qtdProdutoEstoque, qtdUnidades;
	double vlProduto, vlTotal;
	
	Scanner leia = new Scanner(System.in);
	
	public void saudacao() {
		System.out.print("Olá querido(a) cliente. Seja bem vindo ao nosso e-commerce. "
				+ "\nDigite o nome do produto que deseja comprar: ");
		this.nomeProduto = leia.next();
	}
	
	public void estoque() {
		if (this.qtdProdutoEstoque > 0) {
			System.out.print("Digite a quantidade de unidades que você deseja comprar: ");
			qtdUnidades = leia.nextInt();  
			
			if (this.qtdUnidades > this.qtdProdutoEstoque) {
				System.out.println("Infelizmente não temos essa quantidade no estoque.");
			}
			
			else {
				this.vlTotal = this.vlProduto * this.qtdUnidades;
				System.out.println("Total da compra: " +  this.vlTotal);
			}
		}
		
		else {
			System.out.println("Infelizmente não temos essa quantidade no estoque.");
		}
	}
}

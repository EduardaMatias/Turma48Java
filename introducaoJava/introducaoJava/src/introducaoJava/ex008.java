package introducaoJava;
import java.util.Scanner;
public class ex008 {
	public static void main(String[] args) {
		double custoFabrica, custoConsumidor, porcentagemDistribuidor, porcentagemImpostos;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o custo de fábrica do automóvel: ");
		custoFabrica = leia.nextDouble();
		
		porcentagemDistribuidor = custoFabrica * 0.28;
		porcentagemImpostos = custoFabrica * 0.45;
		custoConsumidor = custoFabrica + porcentagemDistribuidor + porcentagemImpostos;
		
		System.out.println("O valor de venda o veículo é " + custoConsumidor);
		leia.close();
	}

}

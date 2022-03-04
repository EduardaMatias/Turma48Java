package lacosDeRepeticao;
import java.util.Scanner;
public class Ex005 {
	public static void main(String[] args) {
		int num, soma = 0;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("O programa irá calcular a soma de todos os números que serão digitados! "
				+ "\nCaso você queira sair do programa, basta digitar o número 0.");
		
		do {
			System.out.print("Digite um número: ");
			num = leia.nextInt();

			soma = soma + num;
		}

		while (num != 0);
		
		leia.close();
		
		System.out.println("A soma dos números digitados é " + soma);
	}
}

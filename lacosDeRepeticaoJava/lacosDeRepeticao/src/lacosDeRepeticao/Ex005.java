package lacosDeRepeticao;
import java.util.Scanner;
public class Ex005 {
	public static void main(String[] args) {
		int num, soma = 0;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("O programa ir� calcular a soma de todos os n�meros que ser�o digitados! "
				+ "\nCaso voc� queira sair do programa, basta digitar o n�mero 0.");
		
		do {
			System.out.print("Digite um n�mero: ");
			num = leia.nextInt();

			soma = soma + num;
		}

		while (num != 0);
		
		leia.close();
		
		System.out.println("A soma dos n�meros digitados � " + soma);
	}
}

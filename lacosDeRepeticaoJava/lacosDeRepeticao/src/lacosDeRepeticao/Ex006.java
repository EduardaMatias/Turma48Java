package lacosDeRepeticao;
import java.util.Scanner;
public class Ex006 {
	public static void main(String[] args) {
		int num, multiplos = 0, soma = 0, media;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("O programa irá calcular a média de todos os múltiplos de 3 digitados! "
				+ "\nCaso você queira sair do programa, basta digitar o número 0.");
		
		do {
			System.out.print("Digite um número: ");
			num = leia.nextInt();
			
			if (num % 3 == 0 && num != 0) {
				multiplos++;
				soma = soma + num;				
			}
		}
		while(num != 0);
		
		media = soma / multiplos;
		
		leia.close();
		System.out.println("A media é " + media);
	}
	
}

package lacosDeRepeticao;
import java.util.Scanner;
public class Ex006 {
	public static void main(String[] args) {
		int num, multiplos = 0, soma = 0, media;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("O programa ir� calcular a m�dia de todos os m�ltiplos de 3 digitados! "
				+ "\nCaso voc� queira sair do programa, basta digitar o n�mero 0.");
		
		do {
			System.out.print("Digite um n�mero: ");
			num = leia.nextInt();
			
			if (num % 3 == 0 && num != 0) {
				multiplos++;
				soma = soma + num;				
			}
		}
		while(num != 0);
		
		media = soma / multiplos;
		
		leia.close();
		System.out.println("A media � " + media);
	}
	
}

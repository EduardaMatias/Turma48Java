package lacosDeRepeticao;
import java.util.Scanner;
public class Ex002 {

	public static void main(String[] args) {
		int n, c, p = 0, i = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for (c=1; c<=10; c++) {
			System.out.print("Digite o " + c + "º número: ");
			n = leia.nextInt();
			
			if(n % 2 == 0) {
				p++;
			}
			
			else {
				i++;
			}
		}
		
		leia.close();
		System.out.print("Você digitou " + p + " números pares, e " + i + " números ímpares.");
	}
}

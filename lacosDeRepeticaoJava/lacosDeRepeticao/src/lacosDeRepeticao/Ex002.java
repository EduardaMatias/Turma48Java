package lacosDeRepeticao;
import java.util.Scanner;
public class Ex002 {

	public static void main(String[] args) {
		int n, c, p = 0, i = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for (c=1; c<=10; c++) {
			System.out.print("Digite o " + c + "� n�mero: ");
			n = leia.nextInt();
			
			if(n % 2 == 0) {
				p++;
			}
			
			else {
				i++;
			}
		}
		
		leia.close();
		System.out.print("Voc� digitou " + p + " n�meros pares, e " + i + " n�meros �mpares.");
	}
}

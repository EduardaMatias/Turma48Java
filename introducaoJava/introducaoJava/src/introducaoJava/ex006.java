package introducaoJava;
import java.util.Scanner;
public class ex006 {
	public static void main(String[] args) {
		double x1, x2, y1, y2, d;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o valor de x1: ");
		x1 = leia.nextDouble();	
		System.out.println("Entre com o valor de x2: ");
		x2 = leia.nextDouble();	
		System.out.println("Entre com o valor de y1: ");
		y1 = leia.nextDouble();	
		System.out.println("Entre com o valor de y2: ");
		y2 = leia.nextDouble();	
		
		d = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		System.out.println("A distância entre os dois pontos é " + d);
		leia.close();
		}
}

package introducaoJava;
import java.util.Scanner;
public class ex004 {
	public static void main(String[] args) {
		int a, b, c, r, s, d;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n?mero inteiro positivo: ");
		a = leia.nextInt();
		System.out.println("Digite o segundo n?mero inteiro positivo: ");
		b = leia.nextInt();
		System.out.println("Digite o terceiro n?mero inteiro positivo: ");
		c = leia.nextInt();
		
		r = (a + b) * (a + b);
		s = (b + c) * (b + c);
		d = (r + s) / 2;
		
		System.out.println("O resultado da express?o ? " + d);
		leia.close();
	}
}

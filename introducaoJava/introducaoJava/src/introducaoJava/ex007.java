package introducaoJava;
import java.util.Scanner;
public class ex007 {
	public static void main(String[] args) {
		double a, b, c, d, e, f, x, y;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o coeficiente de a ");
		a = leia.nextDouble();
		System.out.println("Informe o coeficiente de b ");
		b = leia.nextDouble();
		System.out.println("Informe o coeficiente de c ");
		c = leia.nextDouble();
		System.out.println("Informe o coeficiente de d ");
		d = leia.nextDouble();
		System.out.println("Informe o coeficiente de e ");
		e = leia.nextDouble();
		System.out.println("Informe o coeficiente de f ");
		f = leia.nextDouble();
		
		x = ((c*e) - (b*f)) / ((a*e) - (b*d));
		y = ((a*f) - (c*d)) / ((a*e) - (b*d));
		
		System.out.println("O valor de x � igual a " + x + "\nO valor de y � igual a " + y);
		leia.close();
	}
}

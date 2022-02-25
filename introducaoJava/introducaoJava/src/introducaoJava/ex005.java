package introducaoJava;
import java.util.Scanner;
public class ex005 {
	public static void main(String[] args) {
		double nota1, nota2, nota3, media;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Informe sua primeira nota: ");
		nota1 = leia.nextDouble();
		System.out.println("Informe sua segunda nota: ");
		nota2 = leia.nextDouble();
		System.out.println("Informe sua terceira nota: ");
		nota3 = leia.nextDouble();
		
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
		
		System.out.println("Sua média é " + media);
		leia.close();
	}

}

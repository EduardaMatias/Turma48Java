package condicionaisJava;
import java.util.Scanner;
public class ex004 {
	public static void main(String[] args) {
		double num, raiz, pot;
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite um n�mero: ");
		num = leia.nextDouble();
		
		if(num%2 == 0) {
			raiz = Math.sqrt(num);
			System.out.println("O n�mero � par. \nSua raiz quadrada � igual a " + raiz);
		}
		
		else {
			pot = Math.pow(num, 2);
			System.out.println("O n�mero � �mpar. \nEsse n�mero elevado ao quadrado � igual a " + pot);
		}
		leia.close();
	}
}

package condicionaisJava;
import java.util.Scanner;
public class ex004 {
	public static void main(String[] args) {
		double num, raiz, pot;
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite um número: ");
		num = leia.nextDouble();
		
		if(num%2 == 0) {
			raiz = Math.sqrt(num);
			System.out.println("O número é par. \nSua raiz quadrada é igual a " + raiz);
		}
		
		else {
			pot = Math.pow(num, 2);
			System.out.println("O número é ímpar. \nEsse número elevado ao quadrado é igual a " + pot);
		}
		leia.close();
	}
}

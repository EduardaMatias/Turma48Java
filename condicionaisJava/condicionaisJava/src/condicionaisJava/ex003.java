package condicionaisJava;
import java.util.Scanner;
public class ex003 {
	public static void main(String[] args) {
		int idade;
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Categoria infantil");
		}
		
		else if(idade >= 15 && idade <= 17) {
			System.out.println("Categoria juvenil");
		}
		
		else if(idade >= 18 && idade <= 25) {
			System.out.println("Categoria adulta");
		}
		
		else {
			System.out.println("Número inválido, certifique-se de que você digitou um número entre 10 e 25.");
		}
		leia.close();
	}
}

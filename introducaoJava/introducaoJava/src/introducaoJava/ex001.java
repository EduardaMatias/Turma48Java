package introducaoJava;
import java.util.Scanner;
public class ex001 {
	public static void main(String[] args) {
		int idadeAnos, idadeMeses, idadeDias;
		Scanner leia = new Scanner(System.in);
	
		System.out.println("Informe sua idade em anos: ");
		idadeAnos = leia.nextInt();
		System.out.println("Informe sua idade em meses: ");
		idadeMeses = leia.nextInt();
		System.out.println("Informe sua idade em dias: ");
		idadeDias = leia.nextInt();
		
		System.out.println("Sua idade em dias � " + idadeDias);
		leia.close();
	}
}

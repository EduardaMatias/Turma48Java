package introducaoJava;
import java.util.Scanner;
public class ex002 {
	public static void main(String[] args) {
		int idadeAnos, idadeMeses, idadeDias;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe sua idade em dias: ");
		idadeDias = leia.nextInt();
		
		idadeAnos = idadeDias / 365;
		idadeMeses = idadeAnos * 12;
		
		System.out.println("Sua idade em anos � " + idadeAnos + "\nSua idade em meses � " + idadeMeses + "\nSua idade em dias � " + idadeDias);
		leia.close();
	}
}

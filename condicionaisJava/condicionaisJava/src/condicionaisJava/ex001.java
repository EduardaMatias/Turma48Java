package condicionaisJava;
import java.util.Scanner;
public class ex001 {
	public static void main(String[] args) {
		 int n1, n2, n3;
		 Scanner leia = new Scanner(System.in);
		 
		 System.out.println("Digite tr�s n�meros: ");
		 n1 = leia.nextInt();
		 n2 = leia.nextInt();
		 n3 = leia.nextInt();
		 
		 if(n1 > n2 && n1 > n3) {
			 System.out.println(n1 + " � o maior n�mero!");
		 }
		 
		 else if(n2 > n1 && n2 > n3) {
			 System.out.println(n2 + " � o maior n�mero!");
		 }
		 
		 else if(n3 > n1 && n3 > n2) {
			 System.out.println(n3 + " � o maior n�mero!");
		 } 
		 
		 else {
			 System.out.println("Os n�meros s�o iguais!");
		 }
		 leia.close();
	}
}


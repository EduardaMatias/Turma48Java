package introducaoJava;
import java.util.Scanner;
public class ex003 {
	public static void main(String[] args) {
		int duracaoSegundos,  duracaoMinutos,  duracaoHoras;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a dura��o do evento em segundos: ");
		duracaoSegundos = leia.nextInt();
		
		duracaoHoras = duracaoSegundos / 3600;
		duracaoMinutos = duracaoSegundos / 60;
		
		System.out.println("O evento dura " + duracaoSegundos + " segundos, " + duracaoMinutos + " minutos e " + duracaoHoras + " horas.");
		leia.close();
	}
}

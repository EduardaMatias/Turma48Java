package lacosDeRepeticao;
import java.util.Scanner;
public class Ex004 {

	public static void main(String[] args) {
		int idade, c = 0, pcalmas = 0, mnervosas = 0, hagressivo = 0, ocalmos = 0, inervosos = 0, jcalmos = 0;
		char sexo, psic;

		Scanner leia = new Scanner(System.in);

		while (c < 150) {
			System.out.print("Digite sua idade: ");
			idade = leia.nextInt();

			if (idade < 0) {
				System.out.println("Opção invalida. Inicie novamente!");
				System.exit(0);
			}

			System.out.print("Digite seu sexo (1-feminino / 2-masculino / 3-Outros): ");
			sexo = leia.next().charAt(0);

			if (sexo != '1' && sexo != '2' && sexo != '3') {
				System.out.println("Opção invalida. Inicie novamente!");
				System.exit(0);
			}

			System.out.print("Digite 1 você se considera calma / 2 se você se considera nervosa / "
					+ "3 se você se considera agressiva: ");
			psic = leia.next().charAt(0);
			c++;

			if (psic != '1' && psic != '2' && psic != '3') {
				System.out.println("Opção invalida. Inicie novamente!");
				System.exit(0);
			}

			if (psic == '1') {
				pcalmas++; 
			}
				
			if (psic == '2' && sexo == '1') {
				mnervosas++;
			}
			
			if (psic == '1' && sexo == '3') {
				ocalmos++;
			}
				
			if (idade < 18 && psic == '1') {
				jcalmos++;
			}

			if (psic == '3' && sexo == '2') {
				hagressivo++;
			}
			
			if (idade > 40 && psic == '2') {
				inervosos++;
			}			
		}

		leia.close();
		System.out.println("Número de pessoas calmas: " + pcalmas); 
		System.out.println("Número de mulheres nervosas: " + mnervosas); 
		System.out.println("Número de homens agressivos: " + hagressivo); 
		System.out.println("Número de outros calmos: " + ocalmos);
		System.out.println("Número de pessoas nervosas com mais de 40 anos: " + inervosos); 
		System.out.println("Número de pessoas calmas com menos de 18 anos: " + jcalmos); 
	}

}

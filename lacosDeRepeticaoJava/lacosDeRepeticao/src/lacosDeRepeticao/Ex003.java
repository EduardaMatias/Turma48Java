package lacosDeRepeticao;
import java.util.Scanner;
public class Ex003 {

	public static void main(String[] args) {
		int idade, menos21 = 0, mais50 = 0;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("BEM VINDO A NOSSA PESQUISA! \nEntre com sua idade e digite -99 "
				+ "quando quiser finalizar o programa.");
		
		System.out.print("Digite sua idade: ");
		idade = ler.nextInt();
		
		if (idade < 21) {
			menos21++;
		}
		else if (idade > 50) {
			mais50++;
		}
		
		while(idade != -99) {
			System.out.print("Digite sua idade: ");
			idade = ler.nextInt();
			
			if (idade < 21 && idade != -99) {
				menos21++;
			}
			
			else if (idade > 50) {
				mais50++;
			}	
		}
	
		ler.close();
		System.out.println("A pesquisa foi respondida por " + menos21 + " pessoa(s) com menos de 21 anos. "
				+ "E por " + mais50 + " pessoa(s) com mais de 50 anos. \nFIM DO PROGRAMA");
	}

}

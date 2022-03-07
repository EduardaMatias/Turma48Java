package ex007;

import java.util.Scanner;

public class Paciente {
	String nomePaciente, ala, nomeMedico;
	int numeroVisitas, numeroVisitantes, altaDia;

	Scanner ler = new Scanner(System.in);

	public void visitas() {
		if (this.ala == "UTI") {
			System.out.println("Paciente não pode receber visitas.");
			System.exit(this.numeroVisitantes);
		}

		if (this.numeroVisitas >= 3) {
			System.out.println("O paciente já recebeu o máximo de visitas hoje.");
		}

		if (this.numeroVisitas < 3) {
			System.out.print("O paciente ainda pode receber visitas hoje. \nDigite o número de visitantes: ");
			this.numeroVisitantes = ler.nextInt();

			if (this.numeroVisitantes > 2) {
				System.out.println("Os visitantes não podem entrar todos de uma vez.");
			}

			else {
				System.out.println("Visitantes, podem entrar!");
			}
		}
	}

	public void alta() {
		System.out.println("Olá visitantes! Segundo o Doutor(a) " + this.nomeMedico + " o paciente " + this.nomePaciente
				+ " receberá alta em aproximadamente " + this.altaDia + " dias.");
	}
}

package ex004;
import java.util.Scanner;
public class Funcionario {
	String nome, codigo;
	int horasExtras, horasNormais, totalSalario;
	boolean valeAlimentacao;

	Scanner ler = new Scanner(System.in);
	
	public void saudacao() {
		System.out.print("Olá funcionário! \nVocê recebe R$ 20.00 por horas normais trabalhadas "
				+ "e R$ 30,00 por horas extras. "
				+ "\nEntre com sua quantidade de horas extras: ");
		this.horasExtras = ler.nextInt();
	}
	
	public void salario() {
		this.totalSalario = (20 * this.horasNormais) + (30 * this.horasExtras);
	}
	
	public void desconto() {
		if (this.valeAlimentacao == true) {
			double novoSalario = this.totalSalario - 200;
			System.out.println("Seu salário mensal é R$" + novoSalario);
		}
		
		else {
			System.out.println("Seu salário desse mês é R$" + this.totalSalario);
		}
	}
}

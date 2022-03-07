package ex006;

import java.util.Scanner;

public class ContaBancaria {
	String senha, menu, nome, cpf;
	double saldo, saque;

	Scanner leia = new Scanner(System.in);

	public void saudacao() {
		System.out.print("Olá. Digite sua senha para sacar dinheiro: ");
		this.senha = leia.next();
		System.out.println("...........Entrando...........\nBem-vinde " + this.nome + ", CPF n° " + this.cpf);
	}

	public void saque() {
		System.out.print("Digite o valor que deseja sacar: ");
		this.saque = leia.nextDouble();

		if (this.saque > this.saldo) {
			System.out.println("Você não tem saldo suficiente.");
		}

		else {
			double novoSaldo = this.saldo - this.saque;
			System.out.print("Saque de R$" + this.saque + " realizado. \nSaldo disponível: " + novoSaldo);
		}
	}
}

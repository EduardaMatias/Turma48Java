package ex006;

public class MainContaBancaria {
	public static void main(String[] args) {
		ContaBancaria minhaConta = new ContaBancaria();
		minhaConta.nome = "Eduarda";
		minhaConta.cpf = "56525623401";
		minhaConta.saldo = 3500;
		minhaConta.saudacao();
		minhaConta.saque();
	}
}

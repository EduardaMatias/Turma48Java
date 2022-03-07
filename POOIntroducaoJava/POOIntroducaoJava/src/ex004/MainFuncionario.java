package ex004;

public class MainFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario();
		funcionario1.codigo = "234566";
		funcionario1.nome = "pedro";
		funcionario1.horasNormais = 30;
		funcionario1.valeAlimentacao = true;
		funcionario1.saudacao();
		funcionario1.salario();
		funcionario1.desconto();
	}
}

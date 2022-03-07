package ex001;

public class Cliente {
	double valorTotal;
	String tipoProduto;

	public void bemVindo() {
		System.out.println("Olá querido(a) cliente.\nEstamos na semana do consumidor!! \nNossos produtos "
				+ "do setor de roupas estão com desconto de 50% em compras com valor maior ou igual a R$100,00.");
	}

	public void desconto() {
		if (this.tipoProduto == "roupa" && this.valorTotal >= 100) {
			double decresimo = this.valorTotal * 0.5;
			double novoValor = this.valorTotal - decresimo;

			System.out.println("O valor da sua compra era R$" + this.valorTotal + " e passou a ser R$" + novoValor);
		}

		else {
			System.out.println("Infelizmente, você não cumpre todos os requisitos para conseguir "
					+ "nosso desconto. \nO valor da sua compra é igual a R$" + this.valorTotal);

		}
	}

	public void saudacao() {
		System.out.println("Agradecemos a preferência e esperamos que volte em breve!");
	}
}

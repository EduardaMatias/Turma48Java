package ex003;

public class MainProdutoEletronico {
	public static void main(String[] args) {
       ProdutoEletronico produto1 = new ProdutoEletronico();
       produto1.qtdProdutoEstoque = 10;
       produto1.vlProduto = 3500;
       produto1.saudacao();
       produto1.estoque();
	}
}

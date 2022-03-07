package ex001;

public class MainCliente {
	public static void main(String[] args) {
		Cliente Ana = new Cliente();
		Ana.bemVindo();
		Ana.valorTotal = 250;
		Ana.tipoProduto = "roupa";
		Ana.desconto();
		Ana.saudacao();
	}
}

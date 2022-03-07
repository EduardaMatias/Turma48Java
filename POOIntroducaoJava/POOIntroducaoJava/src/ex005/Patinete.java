package ex005;

public class Patinete {
	String cor;
	int qtdDeRodas;
	boolean rodasIdeais;
	
	public void descricao() {
		System.out.println("O patinete tem cor " + this.cor + " e " + this.qtdDeRodas + " rodas.");
	}
	
	public void andar() {
		if (this.rodasIdeais == false) {
			System.out.println("Esse patinete n�o � seguro, por isso voc� n�o pode andar.");
		}
		
		else {
			System.out.println("Esse patinete � seguro, pode andar.");
		}
	}
	
	public void consertar() {
		this.rodasIdeais = true;
		System.out.println("Agora esse patinete est� seguro, por isso voc� pode andar.");
	}
}

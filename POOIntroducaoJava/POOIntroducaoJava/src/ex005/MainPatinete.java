package ex005;

public class MainPatinete {
	public static void main(String[] args) {
		Patinete meuPatinete = new Patinete();
		meuPatinete.cor = "rosa";
		meuPatinete.qtdDeRodas = 3;
	    meuPatinete.rodasIdeais = false;
	    meuPatinete.descricao();
	    meuPatinete.andar();
	    meuPatinete.consertar();
	}
}

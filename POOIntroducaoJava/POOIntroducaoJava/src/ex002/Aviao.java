package ex002;

public class Aviao {
	String nomeAviao;
	int totalPassageiros, totalCintos, qtPassageiros, qtCintos;
	boolean decolar;

	public void saudacao() {
		System.out.println("Bem vindo ao " + this.nomeAviao + "! Esperamos que todos estejam bem. "
				+ "\nGostariamos de pedir para que todos os passageiros colocassem seus cintos. "
				+ "\nO avi�o s� ir� decolar quando todos estiverem devidamente protegidos.");
	}
	
	public void decolar() {
		if(this.qtPassageiros >= this.qtCintos) {
			System.out.println("O avi�o pode decolar.");
		}
		
		if(this.qtPassageiros < this.qtCintos) {
			System.out.println("O avi�o n�o pode decolar.");
		}
	}
}

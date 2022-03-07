package ex002;

public class MainAviao {
	public static void main(String[] args) {
		Aviao air89 = new Aviao();
		air89.nomeAviao = "air89";
		air89.qtPassageiros = 250;
		air89.qtCintos = 250;
		air89.saudacao();
		air89.decolar();
	}
}

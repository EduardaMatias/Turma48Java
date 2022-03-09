package Ex001;

public class Cachorro extends Animal {
	
	public void correr() {
		boolean deveCorrer = true;
		System.out.println("O animal pode correr: " + deveCorrer);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("AUAUAU");
	}
}

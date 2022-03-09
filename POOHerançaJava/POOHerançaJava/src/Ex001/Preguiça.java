package Ex001;

public class Preguiça extends Animal{
	
	public void subir() {
		boolean deveSubir = true;
		System.out.println("O animal deve subir: " + deveSubir);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("NHAAAA");
	}
}

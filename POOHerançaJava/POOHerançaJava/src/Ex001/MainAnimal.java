package Ex001;

public class MainAnimal {
	public static void main(String[] args) {
		Cachorro cac = new Cachorro();
		Cavalo cav = new Cavalo();
		Preguiça preg = new Preguiça();
		
		//ALTERANDO NOME
		cac.setNome("Bob");
		cav.setNome("Cleber");
		preg.setNome("Maria");
		
		//ALTERANDO IDADE
		cac.setIdade(2);
		cav.setIdade(5);
		preg.setIdade(25);
		
		//ALTERANDO SOM
		cac.setSom("AU AU AU");
		cav.setSom("IRRRRI");
		preg.setSom("INHA");
        
		//SAIDA
		cac.saida();
		cac.correr();
		
		cav.saida();
		cav.correr();
		
		preg.saida();
		preg.subir();
	}
}

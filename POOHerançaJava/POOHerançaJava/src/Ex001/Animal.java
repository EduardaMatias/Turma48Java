package Ex001;

public class Animal {
	private String nome, som;
	private int idade;

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void saida() {
		System.out.println("Nome: " + this.nome +
				"\nIdade: " + this.idade +
				"\nSom: " + this.som);
	}
}

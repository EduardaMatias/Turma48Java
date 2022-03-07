package ex007;

public class MainPaciente {
	public static void main(String[] args) {
		Paciente meuPaciente = new Paciente();
		meuPaciente.nomePaciente = "João";
		meuPaciente.ala = "pós cirurgia";
		meuPaciente.numeroVisitas = 0;
		meuPaciente.nomeMedico = "Paulo";
		meuPaciente.altaDia = 6;
		meuPaciente.visitas();
		meuPaciente.alta();
	}
}

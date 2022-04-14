package entities;

public class Aluno extends Pessoa {
	
	private String matricula;

	public Aluno(Integer id, String nome, String cpf, String matricula) {
		super(id, nome, cpf);
		this.matricula = matricula;
	}

	public Aluno() {
		super();
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", getId()=" + getId() + ", getNome()=" + getNome() + ", getCpf()="
				+ getCpf() + "]";
	}

	
	
	
	
}

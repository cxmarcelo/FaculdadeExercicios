package exercicios.vetor;

public class Aluno {


	private String rA;
	private String nome;
	private String disciplina;
	private float notaNP1;
	private float notaNP2;
	private float notaSub;
	private float notaEx;
	
	public Aluno() {
	}

	public Aluno(String rA, String nome, String disciplina, float notaNP1, float notaNP2, float notaSub, float notaEx) {
		this.rA= rA;
		this.nome = nome;
		this.disciplina = disciplina;
		this.notaNP1 = notaNP1;
		this.notaNP2 = notaNP2;
		this.notaSub = notaSub;
		this.notaEx = notaEx;
	}

	public String getrA() {
		return rA;
	}

	public void setrA(String rA) {
		this.rA = rA;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public float getNotaNP1() {
		return notaNP1;
	}

	public void setNotaNP1(float notaNP1) {
		this.notaNP1 = notaNP1;
	}

	public float getNotaNP2() {
		return notaNP2;
	}

	public void setNotaNP2(float notaNP2) {
		this.notaNP2 = notaNP2;
	}

	public float getNotaSub() {
		return notaSub;
	}

	public void setNotaSub(float notaSub) {
		this.notaSub = notaSub;
	}

	public float getNotaEx() {
		return notaEx;
	}

	public void setNotaEx(float notaEx) {
		this.notaEx = notaEx;
	}
	
}

package aulaFilas;

public class Estudante {

	private String nome;
	private String rA;
	
	public Estudante(String nome, String rA) {
		super();
		this.nome = nome;
		this.rA = rA;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getrA() {
		return rA;
	}
	public void setrA(String rA) {
		this.rA = rA;
	}
}

package filaPessoas;

public class Pessoa {

	private String nome;
	private String rG;
	
	public Pessoa(String nome, String rG) {
		this.nome = nome;
		this.rG = rG;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getrG() {
		return rG;
	}
	public void setrG(String rG) {
		this.rG = rG;
	}
}

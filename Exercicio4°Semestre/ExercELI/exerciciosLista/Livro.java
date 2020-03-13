package exerciciosLista;

public class Livro {

	private String titulo;
	private String autor;
	private int numReg;
	private double preco;
	private Livro anterior;
	
	public Livro(String titulo, String autor, int numReg, double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.numReg = numReg;
		this.preco = preco;
	}
	
	public Livro() {
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumReg() {
		return numReg;
	}

	public void setNumReg(int numReg) {
		this.numReg = numReg;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Livro getAnterior() {
		return anterior;
	}

	public void setAnterior(Livro anterior) {
		this.anterior = anterior;
	}
	
}

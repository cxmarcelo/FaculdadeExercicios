package exerciciosLista;

public class ListaLigada {
	
	private Livro fim;
	
	public ListaLigada() {
		fim = null;
	}

	public void novoNome(Livro novoLivro) {
		novoLivro.setAnterior(fim);
		fim  = novoLivro;
	}

	public void imprimirLivros() {
		Livro atual = fim;
		while(atual !=  null) {
			System.out.println(atual.getAutor());
			System.out.println(atual.getNumReg());
			System.out.println(atual.getTitulo());
			System.out.println(atual.getPreco());
			System.out.println("------------------------------------------------------------------");
			atual = atual.getAnterior();
		}
	}
}

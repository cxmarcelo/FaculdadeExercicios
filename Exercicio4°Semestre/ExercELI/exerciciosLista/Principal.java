package exerciciosLista;

public class Principal {

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		Livro l1 = new Livro("Trilogia Espinhos", "Mark Lawrence", 58957, 60.99);
		Livro l2 = new Livro("O Cortiço", "Machado de Assis", 61157, 45.45);
		Livro l3 = new Livro("Vidas Secas", "Graciliano Ramos", 11897, 35.11);
		
		lista.novoNome(l1);
		lista.novoNome(l2);
		lista.novoNome(l3);
		
		lista.imprimirLivros();
		
	}
}

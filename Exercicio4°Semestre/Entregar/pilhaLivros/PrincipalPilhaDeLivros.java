package pilhaLivros;

public class PrincipalPilhaDeLivros {

	public static void main(String[] args) {
		
		Livro l1 = new Livro("Trilogia Espinhos", "Mark Lawrence", 58957, 60.99);
		Livro l2 = new Livro("O Cortiço", "Machado de Assis", 61157, 45.45);
		Livro l3 = new Livro("Vidas Secas", "Graciliano Ramos", 11897, 35.11);
		PilhaDeLivros pilha = new PilhaDeLivros();
		pilha.push(l1);
		pilha.push(l2);
		pilha.push(l3);
		
		System.out.println(((Livro)pilha.pop()).getTitulo());
		System.out.println(pilha.size());
		System.out.println(pilha.pop());
		
	}
}

package filaPessoas;

import java.util.LinkedList;
import java.util.Queue;


public class FilaPessoas {

	public static void main(String[] args) {
	
		Queue<Pessoa> fila = new LinkedList<>();
		Pessoa pessoa1 = new Pessoa("Marcos", "d9474-7");
		Pessoa pessoa2 = new Pessoa("Pedro", "f9574-2");
		Pessoa pessoa3 = new Pessoa("Simone", "g98474-3");
		Pessoa pessoa4 = new Pessoa("Lais", "i3884-7");
		Pessoa pessoa5 = new Pessoa("Tacio", "g34444-0");
		fila.add(pessoa1);
		fila.add(pessoa2);
		fila.add(pessoa3);
		fila.add(pessoa4);
		fila.add(pessoa5);

		fila.forEach(pessoa -> System.out.print(((Pessoa)pessoa).getNome() + "  "));
	}
}
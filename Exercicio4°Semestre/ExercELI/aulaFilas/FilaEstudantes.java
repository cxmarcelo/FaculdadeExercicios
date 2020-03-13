package aulaFilas;

import java.util.LinkedList;
import java.util.Queue;

public class FilaEstudantes {
 
	public static void main(String[] args) {
		Queue<Estudante> lista = new LinkedList<>();
		Estudante aluno1 = new Estudante("Marcos", "d9474-7");
		Estudante aluno2 = new Estudante("Pedro", "f9574-2");
		Estudante aluno3 = new Estudante("Simone", "g98474-3");
		Estudante aluno4 = new Estudante("Lais", "i3884-7");
		Estudante aluno5 = new Estudante("Tacio", "g34444-0");
		lista.add(aluno1);
		lista.add(aluno2);
		lista.add(aluno3);
		lista.add(aluno4);
		lista.add(aluno5);

		lista.forEach(aluno -> System.out.println(((Estudante)aluno).getNome()));

	
	}
}

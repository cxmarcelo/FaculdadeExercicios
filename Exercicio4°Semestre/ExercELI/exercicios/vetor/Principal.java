package exercicios.vetor;

import exercicio.vetor.Aluno;
import exercicio.vetor.Vetor;

public class Principal {

	public static void main(String[] args) {
		

		Aluno[] alunos = new Aluno[5];
		Vetor vet= new Vetor();
		
		
		for(int x = 0; x < 5; x++) {
			alunos[x] = new Aluno( "Nf"+ 2786* x,"Joao " + x, "Direito", x *4, x *4, x * 4, x* 4);
			vet.adicionar(alunos[x]);
			
		}
		vet.mostrarAlunos();
	}
}

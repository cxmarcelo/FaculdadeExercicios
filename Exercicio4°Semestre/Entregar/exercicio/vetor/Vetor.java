package exercicio.vetor;

import exercicios.vetor.Aluno;

public class Vetor {

	private int totalDeObjetos= 0;
	private Object[] objetos  = new Object[100];
	
	public void adicionar(Object objeto) {
		this.garantaEspaco();
		this.objetos[this.totalDeObjetos] = objeto;
		this.totalDeObjetos++;
	}
	
	public void adicionar(int posicao, Aluno aluno) {
		this.garantaEspaco();
		if(!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
		for(int i = this.totalDeObjetos - 1; 1 >= posicao; i--) {
			this.objetos[i + 1] = this.objetos[1];
		}
	}
	
	public Object pega(int posicao) throws IllegalAccessException {
		if(!posicaoOcupada(posicao)) {
			throw new IllegalAccessException("Posição Inválida");
		}
		return this.objetos[posicao];
	}
	
	public Aluno pegarAlunos(int posicao) {
		return (Aluno) this.objetos[posicao];
	}
	
	public void remove(int posicao) throws IllegalAccessException {
		if(!this.posicaoOcupada(posicao)) {
			throw new IllegalAccessException("Posição inválida");
		}
		for(int i = posicao; i< this.totalDeObjetos- i; i++) {
			this.objetos[i] = this.objetos[i+1];
		}
	}
	
	
	public boolean contem(Aluno aluno) {
		boolean contem = false;
		for(int i = 0; i < this.totalDeObjetos; i++) {
			if(aluno.equals(this.objetos[i])) {
				contem = true;
			}else {
				contem = false;
			}
		}
		return contem;
	}
	
	public int tamanho() {
		return this.totalDeObjetos;
	}

	public void mostrarAlunos() {
		for(int x= 0; x < totalDeObjetos; x++) {
			System.out.println("[" + x +"]" + "Aluno");
			String dados = "Nome: " + ((Aluno) objetos[x]).getNome() + "\n";
			dados+= "RA: " + ((Aluno) objetos[x]).getrA() + "\n";
			dados+= "Disciplina: " + ((Aluno) objetos[x]).getDisciplina() + "\n";
			dados+= "NP1:" + ((Aluno) objetos[x]).getNotaNP1() + "\n";
			dados+= "NP2:" + ((Aluno) objetos[x]).getNotaNP2() + "\n";
			dados+= "Sub:" + ((Aluno) objetos[x]).getNotaSub() + "\n";
			dados+= "Exame:" + ((Aluno) objetos[x]).getNotaEx() + "\n";
			System.out.println(dados);
			System.out.println("------------------------------------------------------");
		}
	}
	
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeObjetos;
	}
	
	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao < this.totalDeObjetos;
	}

	private void garantaEspaco() {
		if(this.totalDeObjetos == this.objetos.length) {
			Object[] novaArray = new Object[this.objetos.length * 2];
			for(int i = 0; i <  this.objetos.length; i++) {
				novaArray[i] = this.objetos[i];
			}
			this.objetos = novaArray;
		}
	}
}
package pilhas;

import javax.swing.JOptionPane;

public class Pilha {

	private int inicio;
	private int fim;
	private int tamanho;
	private int qtdElementos;
	private int p[];
	
	public Pilha() {
		inicio = fim = -1;
		tamanho = 100;
		p = new int [tamanho];
		qtdElementos = 0;
	}

	
	public boolean estaVazia() {
		if(qtdElementos == 0) {
			return true;
		}
		return false;
	}

	public boolean estaCheia() {
		if( qtdElementos == tamanho -1) {
			return true;
		}
		return false;
	}

	public void adicionar(int e) {
		if(!estaCheia()) {
			if(inicio == -1) {
				inicio = 0;
			}
			fim++;
			p[fim] = e;
		}
	}

	public void remover() {
		if(!estaVazia()) {
			fim--;
			qtdElementos--;
		}
	}

	public void mostrar() {
		String elementos = "";
		for(int i = fim; i>=0; i--) {
			elementos += p[i] + " - ";
		}
		JOptionPane.showMessageDialog(null, elementos);
	}
}
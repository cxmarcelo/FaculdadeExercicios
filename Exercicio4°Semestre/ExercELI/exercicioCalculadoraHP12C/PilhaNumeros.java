package exercicioCalculadoraHP12C;

import javax.swing.JOptionPane;

public class PilhaNumeros {

	private int inicio;
	private int fim;
	private int tamanho;
	private int qtdElementos;
	private int p[];
	
	public PilhaNumeros() {
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
		qtdElementos++;
	}

	public int desempilhar() {
		if(!estaVazia()) {
			int retorno = p[fim];
			fim--;
			qtdElementos--;
			return retorno;
		}else {
			return 0;
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


	public int getQtdElementos() {
		return qtdElementos;
	}
}
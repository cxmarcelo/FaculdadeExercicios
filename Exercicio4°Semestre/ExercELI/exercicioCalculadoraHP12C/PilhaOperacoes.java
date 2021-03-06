package exercicioCalculadoraHP12C;

import javax.swing.JOptionPane;

public class PilhaOperacoes {

	private int inicio;
	private int fim;
	private int tamanho;
	private int qtdElementos;
	private String p[];
	
	public PilhaOperacoes() {
		inicio = fim = -1;
		tamanho = 100;
		p = new String [tamanho];
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

	public void adicionar(String e) {
		if(!estaCheia()) {
			if(inicio == -1) {
				inicio = 0;
			}
			fim++;
			p[fim] = e;
		}
		qtdElementos++;
	}

	public String desempilhar() {
		if(!estaVazia()) {
			String retorno = p[fim];
			fim--;
			qtdElementos--;
			return retorno;
		}else {
			return "Erro";
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
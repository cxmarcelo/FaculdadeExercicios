package listaLigada;

public class ListaLigada {

	private Celula primeira;
	private Celula ultima;
	private int nroElementos;


	public ListaLigada() {
		primeira = null;
		ultima = null;
		nroElementos = 0;
	}

	public boolean isVazia() {
		return (primeira == null && ultima == null);
	}

	public void addInicio(Object elemento) {
		nroElementos++;
		Celula novoElem = new Celula(elemento);
		if(isVazia()) {
			ultima = novoElem;
		}else {
			novoElem.setProxima(primeira);
		}
	}


	public void addFinal(Object elemento) {
		nroElementos++;
		Celula novoElemento = new Celula(elemento);
		if(isVazia()) {
			primeira = novoElemento;
		}else {
			ultima.setProxima(novoElemento);
			ultima = novoElemento;
		}
	}

	
	public void addMeio(Object elemento, int posicao) {
		nroElementos++;
		Celula novaCelula = new Celula(elemento);
		if(posicao <= 1) {
			addInicio(novaCelula);
			return;
		}
		if(posicao > nroElementos) {
			addFinal(novaCelula);
			return;
		}
			
		Celula elementoTemporario = primeira.getProxima();
		for(int posAux = 1; posAux < posicao; posAux++) {
			elementoTemporario = elementoTemporario.getProxima();
			novaCelula.setProxima(elementoTemporario.getProxima().getProxima());
			elementoTemporario.setProxima(novaCelula);
			
		}
	}
}
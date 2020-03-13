package exerciciosProva;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Fases {

	private int qtdCandidatos;
	private int minClassificados;

	private void ordenarVetor(int[] vet) {
		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length; j++) {
				if(vet[i] > vet[j]) {
					int aux;
					aux = vet[i];
					vet[i] = vet[j];
					vet[j] = aux;
				}
			}
		}
	}

	private int[] classificados(int[] vet, int min) {
		if(vet == null || vet.length == 0) {
			return null;
		}
		if(vet.length < min) {
			return vet;
		}

		int[] vetAux = new int[min];

		ordenarVetor(vet);
		for (int i = 0; i < vetAux.length; i++) {
			vetAux[i] = vet[i];
		}

		for (int i = vetAux.length; i < vet.length; i++) {
			for (int j = 0; j < vetAux.length; j++) {
				if(vet[i] > vetAux[j]) {
					vetAux[j] = vet[i];
					break;
				}
			}
		}
		ordenarVetor(vetAux);

		int nota_corte = vetAux[vetAux.length -1];
		if(nota_corte == vetAux[0]) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < vet.length; i++) {
				if(vet[i] == nota_corte) {
					list.add(vet[i]);
				}
			}
			int[] retorno = new int[list.size()];
			for (int i = 0; i < vetAux.length; i++) {
				retorno[i] = list.get(i);
			}
			return retorno;
		}else {

			ArrayList<Integer> listAux = new ArrayList<Integer>();
			for (int i = 0; i < vetAux.length; i++) {
				if(vetAux[i] != nota_corte) {
					listAux.add(vetAux[i]);
				}
			}

			for (int i = 0; i < vet.length; i++) {
				if(nota_corte == vet[i]) {
					listAux.add(vet[i]);
				}
			}

			int[] vetFinal = new int[listAux.size()];
			for (int i = 0; i < vetFinal.length; i++) {
				vetFinal[i] = listAux.get(i);
			}
			return vetFinal;
		}
	}

	private int[] lerClassificados() {
		BufferedReader arquivo;
		int vet[] = null;
		try {
			arquivo = new BufferedReader(new FileReader("c:/exercicios/4semestre/entrada.txt"));
			ArrayList<Integer> candidatos = new ArrayList<Integer>();
			try {
				setQtdCandidatos(Integer.parseInt(arquivo.readLine()));
				setMinClassificados(Integer.parseInt(arquivo.readLine()));
			} catch (Exception e) {
				System.out.println("Erro pra ler a quantidade de candidatos");
			}
			while(arquivo.ready()) {
				String dado = arquivo.readLine();
				try {
					candidatos.add(Integer.parseInt(dado));
				} catch (Exception e) {
					continue;
				}
			}
			arquivo.close();
			vet = new int[candidatos.size()];
			for (int i = 0; i < candidatos.size(); i++) {
				vet[i] = candidatos.get(i);
			}
			return vet;
		} catch (Exception e) {
			System.out.println("Erro para ler o arquivo");
		}
		return vet;
	}
	public void listarClassificados() {
		criarDiretorio();
		int[] lista = lerClassificados();
		lista = classificados(lista, getMinClassificados());
		if(lista == null || lista.length == 0) {
			return;
		}
		try {
			PrintWriter arquivo = new PrintWriter(new FileWriter("c:/exercicios/4semestre/saida.txt", false));
			arquivo.println("Quantidade de aprovados: " + lista.length);
			arquivo.println("Aprovados:");
			for (int i = 0; i < lista.length; i++) {
				arquivo.println(lista[i]);
			}
			
			arquivo.flush();
			arquivo.close();
		} catch (IOException e) {
			System.out.println("Erro para escrever o arquivo de saida");
		}
	}

	private void criarDiretorio() {
		File dir = new File("c:/exercicios");
		if(!dir.exists()) {
			dir.mkdir();
		}
		dir = new File("c:/exercicios/4semestre");
		if(!dir.exists()) {
			dir.mkdir();
		}

		dir = new File("c:/exercicios/4semestre/entrada.txt");
		if(!dir.exists()) {
			try {
				dir.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Erro para criar o arquivo: entrada.txt");
			}
		}

		dir = new File("c:/exercicios/4semestre/saida.txt");
		if(!dir.exists()) {
			try {
				dir.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Erro para criar o arquivo: saida.txt");
			}
		}
	}
	public int getQtdCandidatos() {
		return qtdCandidatos;
	}
	public void setQtdCandidatos(int qtdCandidatos) {
		this.qtdCandidatos = qtdCandidatos;
	}
	public int getMinClassificados() {
		return minClassificados;
	}
	public void setMinClassificados(int minClassificados) {
		this.minClassificados = minClassificados;
	}
	public static void main(String[] args) {
		Fases teste = new Fases();
		teste.listarClassificados();
	}
}

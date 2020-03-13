package exerciciosProva;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class MaquinaCafe {
	private ArrayList<Integer> lerAndares() {
		criarDiretorio();
		BufferedReader arquivo;
		ArrayList<Integer> andares = new ArrayList<Integer>();
		try {
			arquivo = new BufferedReader(new FileReader("c:/exercicios/4semestre/maquinaCafe/entrada.txt"));
			while(arquivo.ready()) {
				String dado = arquivo.readLine();
				try {
					andares.add(Integer.parseInt(dado));
				} catch (Exception e) {
					continue;
				}
			}
		} catch (Exception e) {
			System.out.println("Erro para ler o arquivo");
		}
		return andares;
	}
	
	
	public void calcularTempo() {
		ArrayList<Integer> andar = lerAndares();
		int aux = 0;
		for (int i = 0; i < andar.size(); i++) {
			if(andar.get(i)> andar.get(aux)) {
				aux = i;
			}
		}
		aux++;
		
		int tempoTotal = 0;
		switch (aux) {
		case 1:
			tempoTotal += andar.get(2) * 3;
			tempoTotal += andar.get(1) * 2;
			tempoTotal += andar.get(0) * 1;
			break;

		case 2:
			tempoTotal += andar.get(2) * 2;
			tempoTotal += andar.get(1) * 1;
			tempoTotal += andar.get(0) * 2;
			break;

		case 3:
			tempoTotal += andar.get(2) * 1;
			tempoTotal += andar.get(1) * 2;
			tempoTotal += andar.get(0) * 3;
			break;

		default:
			System.out.println("Erro");
			break;
		}
		escreverTempo(tempoTotal);
	}

	private void escreverTempo(int tempo) {
		criarDiretorio();
		try {
			PrintWriter arquivo = new PrintWriter(new FileWriter("c:/exercicios/4semestre/maquinaCafe/saida.txt", false));
			arquivo.println(tempo);
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

		dir = new File("c:/exercicios/4semestre/maquinaCafe");
		if(!dir.exists()) {
			dir.mkdir();
		}

		dir = new File("c:/exercicios/4semestre/maquinaCafe/entrada.txt");
		if(!dir.exists()) {
			try {
				dir.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Erro para criar o arquivo: entrada.txt");
			}
		}
		dir = new File("c:/exercicios/4semestre/maquinaCafe/saida.txt");
		if(!dir.exists()) {
			try {
				dir.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Erro para criar o arquivo: saida.txt");
			}
		}
	}
	public static void main(String[] args) {
		new MaquinaCafe().calcularTempo();
	}
}

package ex1grafos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GrafoCaracteristicas {


	public int[][] lerTxt() {
		BufferedReader arquivo;
		try {
			arquivo = new BufferedReader(new FileReader("c:/grafos/arquivo.txt"));

			//Gambiarra que funciona
			//Pensar num jeito melhor
			int tamanho = arquivo.readLine().length();
			int matriz[][] = new int[tamanho][tamanho];
			int cont = 0;
			arquivo.close();
			arquivo = new BufferedReader(new FileReader("c:/grafos/arquivo.txt"));

			while(arquivo.ready()) {
				try {
					String[] dados = arquivo.readLine().split("");
					
					if(cont <= tamanho) {
						for (int x = 0; x < matriz.length; x++) {
							try {
								matriz[cont][x] = Integer.parseInt(dados[x]);
							} catch (Exception e) {
								System.out.println("Erro ao passar o valor para a tabela");
							}
						}
					}
				}catch (Exception e) {
					System.out.println("Falho ao ler linha");
					continue;
				}
				cont++;
			}
			arquivo.close();
			return matriz;
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Erro na leitura do arquivo - read()");
		}
		return null;
	}
	
	
	public void imprimirMatriz(int matriz[][]) {
		
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		
		GrafoCaracteristicas teste = new GrafoCaracteristicas();
		teste.imprimirMatriz(teste.lerTxt());
		
		
	}
}

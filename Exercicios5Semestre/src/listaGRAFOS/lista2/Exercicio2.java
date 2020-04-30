package listaGRAFOS.lista2;

import java.util.ArrayList;

public class Exercicio2 {

	/*2)	 Escreva	 um	 programa	 que	 receba	 como	 entrada	 um	 número	 inteiro	 n correspondente	 ao	
número	de	vértices	e	apresente	como	saída	a matriz		e	a	lista	de	adjacências	para	o	grafo	completo	
Kn*/
	
	public int[][] criarKn(int n) {
		int[][] matriz = new int[n][n];

		for (int li = 0; li < matriz.length; li++) {
			for (int col = 0; col < matriz.length; col++) {
				if(li == col) {
					matriz[li][col] = 0;
				}else {
					matriz[li][col] = 1;
				}
			}
		}
		return matriz;
	}

	public ArrayList<ArrayList<Integer>> listaAdjacencia(int[][] matriz) {
		ArrayList<ArrayList<Integer>> lista = new ArrayList<ArrayList<Integer>>();
		for (int li = 0; li < matriz.length; li++) {
			ArrayList<Integer> listaAux = new ArrayList<Integer>();
			listaAux.add(li + 1);
			for (int col = 0; col < matriz.length; col++) {
				if(matriz[li][col] != 0) {
					for (int i = 0; i < matriz[li][col]; i++) {
						listaAux.add(col + 1);
					}
				}
			}
			lista.add(listaAux);
		}
		return lista;
	}
	
	public void imprimirLista(int[][] matriz) {
		ArrayList<ArrayList<Integer>> lista = listaAdjacencia(matriz);
		System.out.println("Lista de adjacências");
		for (ArrayList<Integer> linhas : lista) {
			for (Integer valores : linhas) {
				System.out.print(valores.intValue() + " -> ");
			}
			System.out.print("-");
			System.out.println();
		}
		System.out.println();
	}
	
	
	public void imprimirMatriz(int[][] matriz) {
		System.out.println("Matriz de adjacências ");
		for (int li = 0; li < matriz.length; li++) {
			for (int col = 0; col < matriz.length; col++) {
				System.out.print(matriz[li][col] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Exercicio2 exe = new Exercicio2();
		exe.imprimirMatriz(exe.criarKn(5));
		exe.imprimirLista(exe.criarKn(5));
		
		
	}
}
